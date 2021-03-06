{:title "Papers I read"
 :layout :post
 :page-index 0
 :navbar? false}

#### Dynamo: Amazon's Highly Available Key-value Store

The
[paper](https://s3.amazonaws.com/AllThingsDistributed/sosp/amazon-dynamo-sosp2007.pdf)
appeared in 2007 and it describes design and implementation of Dynamo, a
database that powers several Amazon's services.

The database is configurable and it allows developers to trade consistency to
achieve high availability and performance. The most interesting insight from the
paper was that many task that we implement using an SQL database ("by default")
could be implemented using some other storage system that doesn't support
transactions or consistency if there's need for higher availability or
performance. It's also interesting to get some insight into the scale at which
Amazon operates or operated 10 years ago.

#### Fundamental Concepts in Programming Languages by Christopher Strachey

The paper describes concepts that we meet in different programming languages.
Much of those are often taken for granted, so it's good to see difficulties
behind a concept that's deceptively simple.

The paper is not easy to read, unless you're very knowledgeable about semantics
of programming languages. Nevertheless, I enjoyed exercising my brain with
somewhat cryptic mathematical material.

I will probably revisit this paper or another resource about semantics of
programming languages in future. It would be great to find a resource that's
approachable, even for someone that didn't learn a lot about semantics of
programming languages through the formal education.

#### Deep API Learning

While other papers on the list are fairly old, this one came out this year. It's
by a group of authors from The Hong Kong University of Science and Technology and
Microsoft Research, Beijing, China.

An interesting thing about the paper is that it was featured on the Hacker News
home page couple of weeks ago. It's nice to see a new paper from the field on
HN.

The main subject of the paper is deep learning. Since I'm not very familiar with
the field of machine learning, a good portion of the paper wasn't readable to
me. However, I got few interesting insights.

The authors described the problem in simple words - the goal is to create a deep
learning based solution that would translate natural language search query into
a sequence of API calls that solve the problem in a particular programming
language. For example if you search for `delete files and folders in a directory`
you get this solution for Java programming language:

```java
File.isDirectory
File.list
File.new
File.delete
```

So the goal is to help programmers get relevant information when working with an
unfamiliar API.

The most interesting thing for me is the way authors gathered learning data for
the machine learning based solution. They downloaded a large number of Java
projects from GitHub. Then they "parsed" all methods with their docs. They used
the first sentence from a method docs as "natural language query", while the
source code was further analyzed to provide the API sequence calls solution for
the query. I think this is an ingenious way to provide a large body of learning
material for the deep learning engine.

The solution performed better than other solution from the domain and the
authors described possible improvements. I hope to see more research where
different techniques are used to improve life of programmers and I hope to see
more papers featured on Hacker News.

#### The Imitation Game by Alan Turing

Alan Turing was interested in the question "Can machines think?". Since the
question is unambiguous, Turing decided to replace it with another one that's
expressed in relatively unambiguous words. He described a game called the
Imitation Game.

The game is played by three parties: A is a computer, B is a person and C is an
interrogator. The interrogation asks questions through a chat system and he's
goal is to find out which one of the 2 parties is the computer. If the computer
can "trick" the interrogator and pass as human in high percentage of cases, it
wins the game and it is said to have some properties related to thinking.

In the paper, Turing discusses the proposed question and if the question is
worth asking. He describes the digital computer involved in the game and some
limitations obstacles that one should consider when building the computer. He
argues that one of the best ways to build the computer that can pass the test is
with machine learning.

The paper appeared in 1950 in Computing machinery and intelligence. Since then
it was widely cited and criticized. One of the critiques is that by following
the rules of the game, you won't build a computer that can think. Instead, the
machine will end up in the local minimum - it will be good at pretending to be
human in the Imitation Game but not much else. Nevertheless, the paper was very
influential and it planted the seed for a new branch of research in the
artificial intelligence field.

#### Lisp: A Language for Stratified Design by Harold Abelson and Gerald Jay Sussman

The paper was published in 1987 by two MIT professors Abelson and Sussman.
Abelson and Sussman are famous by the book and related MIT course called
Structure and Interpretation of Computer Programs, often abbreviated
[SICP](https://en.wikipedia.org/wiki/Structure_and_Interpretation_of_Computer_Programs).
The course is [available online](https://www.youtube.com/watch?v=2Op3QLzMgSY) for free.

The paper explains how Lisp differs from other languages in the way programs are
constructed. Instead of combining primitives, Lisp programs are often
constructed by designing domain specific languages and combining abstractions
from those languages. This style of programming is impossible in many popular
languages that lack expressive power to construct domain specific languages. The
paper is interesting for anyone who wants to know what makes Lisp special.

#### Organizing Programs Without Classes

This paper is written by a group of authors from Stanford. It was published in
1991.

It speaks about object oriented languages that are not class based. Instead,
they use prototypes and traits to implement extensions, encapsulation and
dynamic inheritance. The paper compares class based and classless languages and
their expressive power.

The paper is using
[Self](https://en.wikipedia.org/wiki/Self_%28programming_language%29) as an
example, but many concepts can be applied to the most popular prototype based
programming language today - JavaScript.

#### Searching for Spaceships by David Eppstein

This paper is different than others on the list. While most other papers would be
interesting to any programmer, this one is reserved for
[Game of Life](https://en.wikipedia.org/wiki/The_Game_of_Life) enthusiasts. It
explains the rich Life vocabulary and presents different species of Life. Then it
compares different techniques for searching for spaceships and presents a new
technique developed by the author.

If you are into Life and dream about finding spaceships and implementing your
own search program, this is a great paper for you. It's dense, so I have to read
it few more times. The paper was published in 2000, so I assume that finding the
list of papers that cite *Searching for Spaceships* will produce an interesting
reading material.

#### Computer Programming as an Art by Donald E. Knuth

Computer Programming as an Art is the ACM Turing Award Lecture by
[Donald Knuth](https://en.wikipedia.org/wiki/Donald_Knuth) from 1974. Knuth is
famous by his multi-volume work
[The Art of Computer Programming](https://en.wikipedia.org/wiki/The_Art_of_Computer_Programming),
sometimes abbreviated as TAOCP.

In his lecture, Knuth explains why he chose to call programming an art. He's not
calling the whole programming "universe" an art. Instead, he explains that some
parts of programming profession are an art, while some are science or a craft.

I remember that few years ago blog posts and conference talks about programming
as art/craft/engineering/science were appearing everywhere. Knuth's lecture is
the earliest and probably the most important discussion on the topic as it
inspired many others.

This is another paper I expect to keep returning over the years.

#### Why Functional Programming Matters by John Hughes

The paper was originally published in 1984. It discusses advantages of
functional programming over "conventional" languages. In particular, it
discusses how higher order functions and lazy evaluation contribute to
modularity.

I found useful that the paper clearly expresses how 2 major ideas from
functional programming contribute to the overall functional programming style.

#### The Humble Programmer by Edsger W. Dijkstra

The Humble Programmer is the ACM Turing award Lecture by
[Dijkstra](https://en.wikipedia.org/wiki/Edsger_W._Dijkstra) from 1972. And it's
a fantastic paper!

Dijkstra entered the programming profession in 1952. He talks about his
experience as the first Dutch programmer and one of the pioneers of the
discipline. He also speaks about problems and misconceptions that come from that
period and some major milestones for the programming profession (like
[EDSAC](https://en.wikipedia.org/wiki/Electronic_delay_storage_automatic_calculator),
[FORTRAN](https://en.wikipedia.org/wiki/Fortran),
[LISP](https://en.wikipedia.org/wiki/Lisp_%28programming_language%29) and
[ALGOL 60](https://en.wikipedia.org/wiki/ALGOL_60)).

There are few popular quotes that come from the lecture. Just one of them is:

> If you want more effective programmers, you will discover that they should not
waste their time debugging, they should not introduce the bugs to start with.

And perhaps my favorite:

> The competent programmer is fully aware of the strictly limited size of his
own skull; therefore he approaches the programming task in full humility, and
among other things he avoids clever tricks like the plague.

The paper if full of gems like these. I expect to keep returning to the paper
for years.

#### Some History of Functional Programming Languages by D. A. Turner.

It was generally an interesting paper, although hard to follow
in some parts. I did learn some interesting facts, though. For example, that
[LISP](https://en.wikipedia.org/wiki/Lisp_%28programming_language%29), was not
influenced by [lambda calculus](https://en.wikipedia.org/wiki/Lambda_calculus).
Apparently, [John McCarthy](https://en.wikipedia.org/wiki/John_McCarthy_%28computer_scientist%29)
didn't study [Church's](https://en.wikipedia.org/wiki/Alonzo_Church) papers,
before he invented LISP. Modern lisps, however, are based on lambda calculus.

Another interesting part is a discussion about languages that influenced
[Haskell](https://en.wikipedia.org/wiki/Haskell_%28programming_language%29).

[Download paper](https://www.cs.kent.ac.uk/people/staff/dat/tfp12/tfp12.pdf).

