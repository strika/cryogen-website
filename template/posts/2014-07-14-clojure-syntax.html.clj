; @layout post
; @title Clojure Syntax - From Empty List To Macros

(p "Few months ago I gave a talk at " (link "Ctrl+Flow" "http://renderedtext.com/blog/2013/12/19/ctrl-flow-notes/") ", a local hackers metup organized by " (link "Rendered Text" "http://renderedtext.com")  ". I'm writing the core of the talk here for memory and future reference.")

[:h2 "Clojure Syntax"]

#-CLOJURE
(defn- fib-iter
  [max n i j]
  (if (= n max)
    j
    (recur max
           (inc n)
           j
           (+ i j))))
CLOJURE

(p "One of the most repealing properties of Clojure for newcomers is it's syntax. If you didn't have an exposure to a Lisp before, it looks fairly alien with all the parenthesis. Our goal here is to discover where does the syntax comes from and why is it so different from other languages out there.")

[:h2 "Clojure Reader"]

(p "First, let's introduce a character.")

(p
  [:img {:src "http://robohash.org/Strika" :alt "Robot image, representing Clojure Reader"}])

(p "The friendly looking robot is Clojure Reader. He's job is similar like interpreters in other languages " (link "[1]" "#1") ". You give him a piece of code, it executes it and returns you the result. But there is one significant difference. While other interpreters eat lines of code - Clojure Reader eats lists!")

(p "So the first thing to learn from Clojure Syntax is the simplest, most basic list - an empty list:")

#-CLOJURE
()
CLOJURE

(p "Two characters, in it's glory - an open parenthesis and a closed parenthesis.")

[:h2 "Lists Represent Code"]

(p "Let's try to add a two numbers with Clojure. Since Clojure Reader eats lists, you need construct a list with 3 items - a + sign, a number and another number.")

#-CLOJURE
(+ 1 2)
3
CLOJURE

(p "And Clojure Reader will happily return 3. It works. Let's try more:")

#-CLOJURE
(- 5 1)
4

(+ 1 2 3)
6
CLOJURE

(p "We can already see a pattern here. If you want the Clojure Reader to execute a function, you construct a list where first item of the list is the function and other items of the list are arguments to the function. An interesting thing to note is that + and - are just regular functions that can accept more than 2 arguments.")

[:h2 "Lists of Lists of Lists"]

(p "Let's examine a more complex arithmetic expression:")

#-CLOJURE
(* (- 12 8) (+ 1 2))
12
CLOJURE

(p "Clojure evaluates complex expressions in steps:")

#-CLOJURE
(* (- 12 8) (+ 1 2))
(* 4 (+ 1 2))
(* 4 3)
12
CLOJURE

(p "As with most modern programming languages, Clojure first evaluates a function arguments and then the function itself.")

(p "As we saw before, + and - are just functions. They are not operators. And there are no operator precedence in Clojure. It's not needed. Parenthesis are not used to group expressions, but to create lists to be executed.")

[:h2 "Variables and Functions"]

#-CLOJURE
(def a 3)
(def b 4)
(+ a b)
7
CLOJURE

(p "To define a variable in Clojure you should construct a list where first item of the list is a keyword *def*, followed by the variable name, followed by the variable value.")

(p "Variables can also hold functions:")

#-CLOJURE
(def add-2
  (fn [n]
    (+ n 2)))

(add-2 7)
9
CLOJURE

#-CLOJURE
(def more-than-5?
  (fn [n]
    (if (> n 5)
      "YES"
      "NO")))

(more-than-5? 10)
"YES"
CLOJURE

[:h2 "Lists For Collections"]

(p "Of course, lists can be used for more than code. They can also hold *just* data. But, creating a list of numbers with what we learned so far may end up unexpectedly:")

#-CLOJURE
(def numbers (1 2 3 4 5))
Error! There is no function "1".
CLOJURE

(p "The problem is that Clojure follows a hard rule - it will try to execute a first item of a list as it were a function. You need to tell Clojure not to execute a list with ' operator.")

#-CLOJURE
(def numbers '(1 2 3 4 5))

(count numbers)
5

(first numbers)
1

(rest numbers)
(2 3 4 5)

(map add-2 numbers)
(3 4 5 6 7)
CLOJURE

(p "In the last example, the *map* function executes the *add-2* function on all items of *numbers*.")

[:h2 "What Can You Put In a List?"]

(p "Clojure is a dynamically typed language so lists can hold different types. It's interesting that a list can hold some unexpected stuff too:")

#-CLOJURE
(def some-code '(+ 1 2))

(first some-code)
+

(rest some-code)
(1 2)

(eval some-code)
3

(def new-code
  (cons '-
        (rest some-code)))

(println new-code)
(- 1 2)

(eval new-code)
-1
CLOJURE

(p "You can put a piece of code in a list,  play with it and execute it. In the example, we removed + from the *some-code*, inserted - instead and created the *new-code*.")

(p "You may point out that a similar thing is available in Ruby, JavaScript and other languages. There, you would put a code in a string and execute it. The difference, though, is that with Clojure, you have all the functions available to work with collections to mold the code. In other languages you have only the functions that work with strings - a much less powerful set.")

[:h2 "Extending the Language"]

(p "We already saw how *if* in Clojure looks like:")

#-CLOJURE
(if (= 1 1)
  (println "1 is indeed 1"))
"1 is indeed 1"
CLOJURE

(p "Let's try to create *unless* in Clojure:")

#-CLOJURE
(unless (= 1 1)
  (println "1 is not really 1"))
CLOJURE

(p "We could try with a function:")

#-CLOJURE
(def unless
  (function [condition code]
            (if (not condition)
              code)))
CLOJURE

(p "What happens when we try to execute it?")

#-CLOJURE
(unless (= 1 1)
  (println "1 is not really 1"))
"1 is not really 1"
CLOJURE

(p "Although the condition is true, Clojure executed the body of *unless*. Problem is that, as we said before, Clojure first executes arguments of a function and then the function itself. This means that Clojure first executed " [:cite "(println \"1 is not really 1\")"] " and then the *unless* function itself. It's obvious *unless* can't be implemented with a function.")

[:h2 "Macros"]

(p "To implement *unless* we need to use macros.")

#-CLOJURE
(defmacro unless [condition code]
  '(if (not ~condition)
     ~code))
CLOJURE

(p "Macros are used to transform the code and they don't execute parameters. So an *unless* call:")

#-CLOJURE
(unless (= 1 1)
  (println "1 is not really 1"))
CLOJURE

(p "would first be transformed to:")

#-CLOJURE
(if (not (= 1 1))
  (println "1 is not really 1"))
CLOJURE

(p "and then executed, which would produce the desired result.")

(p "Macros allow you to define a feature - control structure, that looks like it was included in the language itself - to extend the language. Our *unless* macro looks similar to *if*. You can't tell it wasn't shipped with Clojure.")

[:h2 "Why Macros?"]

(p "In 1996, Java appeared with *for* loop. In 2004 Java received an upgraded *for-each* loop.")

#-JAVA
// 1996.
for (int i = 0; i < collection.size(); i++) {
  SomeType var = collection.get(i);
  ...
}

// 2004.
for (SomeType var : collection) {
  ...
}
JAVA

(p "It took years to add the upgraded loop to Java. Is there a way you can add a similar feature to the language yourself? You would need to open the Java compiler, to learn the bytecode and to master the language Java was implemented in. With Clojure, you can implement the *for-each* loop with a macro in just few lines of Clojure:")

#-CLOJURE
(defmacro foreach [[sym coll] & body]
  `(loop [coll# ~coll]
     (when-let [[~sym & xs#] (seq coll#)]
       ~@body
       (recur xs#))))

(foreach [i numbers]
         (println i))
CLOJURE

(p "There are few funny looking characters in the implementation, but it's just 5 lines of code. Any devoted Clojure developer could do it.")

(p "Clojure's extensibility comes from the fact that Clojure code is made of Clojure lists. Code is data. And that's why macros can transform code into other code.")

(p "Now you know when you see a lot of parenthesis there are no reason to frown. It's just lists of lists. Data. Code.")

[:br]

[:p
 [:span {:id "1"} "[1] This is not really what Clojure Reader does, but for the sake of introduction to Clojure syntax, it's OK to pretend it is."]]
