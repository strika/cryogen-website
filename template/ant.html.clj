; @layout  default
; @title   Langton's Ant

[:div {:class "col-sm-8 col-sm-offset-2 content"}
  [:h1 "There are ants on the page!"]

  [:p "Yes there are! And not just any ants, but Langton's ants "
      (link "[1]." "#1") " Langton's ant is a two-dimensional Turing machine with a very simple set of rules:"]

  [:ul
   [:li "At a white square, turn 90° right, flip the color of the square, move forward one unit"]
   [:li "At a black square, turn 90° left, flip the color of the square, move forward one unit"]]

  [:p "Although rules are very simple, they can produce complex behaviour. It was invented by Chris Langton "
      (link "[2]" "#2") " in 1986."]

  [:p "I implemented the ant for fun in JavaScript - " (link "Langton's ant." "https://github.com/strika/ant")
      " I find it to be a great \"programming excercise/kata + a geeky computer history lesson\" combo."]

  [:p
   [:span {:id "1"} "[1] " (link "Langton's ant on Wikipedia" "https://en.wikipedia.org/wiki/Langton%27s_ant")]
   [:br]
   [:span {:id "2"} "[2] " (link "Chris Langton on Wikipedia" "https://en.wikipedia.org/wiki/Chris_Langton")]]]

(js ["/js/ant/lib/underscore-min.js"
     "/js/ant/lib/raphael-min.js"
     "/js/ant/src/model/Ant.js"
     "/js/ant/src/model/AntFactory.js"
     "/js/ant/src/model/World.js"
     "/js/ant/src/view/WorldView.js"
     "/js/AntMain.js"])
