; @layout  default
; @title   Home
; @page-id home

[:article {:class "posts"}
 [:h1 "Posts"]

 [:ul
  (for [p (:posts site)]
    [:li
     [:span
       (link (:title p) (:url p))
       [:time (misaki.util.date/date->string (:date p))]]])]]
;/article

[:article {:class "experiments"}
 [:h1 "Projects and experiments"]
 [:p {:id "practicioner"} "A practicioner should never stop practicing"]
 (link "There are ants on the page!" "/ant.html")
 (link "Green Hood" "https://github.com/strika/greenhood")
 (link "Blue Hood" "https://github.com/strika/bluehood")
 (link "Project Euler solutions in Clojure" "https://github.com/strika/euler")
 (link "Vim configuration" "https://github.com/strika/vimfiles")
 (link "Dotfiles" "https://github.com/strika/dotfiles")
 (link "This website source code" "https://github.com/strika/strika.github.com")]
;/article

(js ["/js/ant/lib/underscore-min.js"
     "/js/ant/lib/raphael-min.js"
     "/js/ant/src/model/Ant.js"
     "/js/ant/src/model/AntFactory.js"
     "/js/ant/src/model/World.js"
     "/js/ant/src/view/WorldView.js"
     "/js/AntMain.js"])
