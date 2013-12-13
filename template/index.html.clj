; @layout  default
; @title   Home

[:article {:class "posts"}
 [:h1 "Posts"]

 [:ul
  (for [p (:posts site)]
    [:p
     (link (:title p) (:url p))
     [:time (misaki.util.date/date->string (:date p))]])]]
;/article

[:article {:class "experiments"}
 [:h1 "Projects and experiments"]
 [:p {:id "practicioner"} "A practicioner should never stop practicing"]
 [:p (link "There are ants on the page!" "/ant.html")]
 [:p (link "Green Hood" "https://github.com/strika/greenhood")]
 [:p (link "Blue Hood" "https://github.com/strika/bluehood")]
 [:p (link "Project Euler solutions in Clojure" "https://github.com/strika/euler")]
 [:p (link "Vim configuration" "https://github.com/strika/vimfiles")]
 [:p (link "Dotfiles" "https://github.com/strika/dotfiles")]
 [:p (link "This website source code" "https://github.com/strika/strika.github.com")]]
;/article

(js ["/js/ant/lib/underscore-min.js"
     "/js/ant/lib/raphael-min.js"
     "/js/ant/src/model/Ant.js"
     "/js/ant/src/model/AntFactory.js"
     "/js/ant/src/model/World.js"
     "/js/ant/src/view/WorldView.js"
     "/js/AntMain.js"])
