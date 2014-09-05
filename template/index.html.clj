; @layout  default
; @title   Home
; @page-id home

[:div {:class "col-sm-8 col-sm-offset-2 content"}
  [:div {:class "avatar"}]

  [:header
    [:h1 "Hi there!"]]

  [:p {:class "introduction"}
   "Thanks for stopping by. My name is Nebojša Stričević, but friends call me Strika. So should you."]

  [:p "I live in Novi Sad, Serbia, with my wonderful wife Tanja and son Mihajlo."] 

  [:p "I'm a web engineer at " (link "Rendered Text" "http://renderedtext.com") ", Novi Sad."]

  [:p "In free time, I enjoy coffee and black tea, dark chocolate, dark beer and " (link "pelinkovac" "https://en.wikipedia.org/wiki/Pelinkovac") ". "
      "I'm also interested in mechanical watches and older cars."]

  [:p "My long term life goal is to increase the number of stars I can see each day."]

  [:p {:class "introduction"}
   "Feel free to send me an " [:a {:href "mailto:nebojsa.stricevic@gmail.com"} "email"]
   ", contact me on " (link "Twitter" "http://twitter.com/nstricevic")
   " or connect with my " (link "LinkedIn account" "http://rs.linkedin.com/in/nebojsastricevic/")
   ". Also, check out my work on " (link "Github" "http://github.com/strika") "."]
  
  [:p {:class "introduction"}
   "If you're interested in my professional work, please see my " (link "resume" "/cv.html") "."]]

[:div {:class "col-sm-8 col-sm-offset-2 content"}
  [:article {:class "posts"}
   [:h1 "Posts"]

   [:ul {:class "link-list"}
    (for [p (:posts site)]
      [:li
       [:span
         (link (:title p) (:url p))]])]]]

[:div {:class "col-sm-8 col-sm-offset-2 content"}
 [:h1 "Projects and experiments"]
 [:p {:class "practicioner"}
  [:small "A practicioner should never stop practicing"]]
 [:ul {:class "link-list"}
   [:li (link "servisne.info" "https://github.com/strika/servisne.info")]
   [:li (link "There are ants on the page!" "/ant.html")]
   [:li (link "Project Euler solutions in Clojure" "https://github.com/strika/euler")]
   [:li (link "Vim configuration" "https://github.com/strika/vimfiles")]
   [:li (link "Dotfiles" "https://github.com/strika/dotfiles")]
   [:li (link "This website source code" "https://github.com/strika/strika.github.com")]]]

(js ["/js/ant/lib/underscore-min.js"
     "/js/ant/lib/raphael-min.js"
     "/js/ant/src/model/Ant.js"
     "/js/ant/src/model/AntFactory.js"
     "/js/ant/src/model/World.js"
     "/js/ant/src/view/WorldView.js"
     "/js/AntMain.js"])
