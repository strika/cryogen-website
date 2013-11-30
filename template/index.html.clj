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
 [:h1 "Experiments"]
 [:p {:id "practicioner"} "A practicioner should never stop practicing"]
 [:p (link "Langton's ant" "https://github.com/strika/ant")]
 [:p (link "Blue Hood" "https://github.com/strika/bluehood")]]
;/article
