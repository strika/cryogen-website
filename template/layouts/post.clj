; @layout  default
; @title   post default title

[:article
 ; page header
 [:div {:class "page-header"}
  ; post title
  [:h1 (:title site)]
  ; post date
  (post-date)]

 ; contents
 [:div {:class "post"} contents]]

[:br]

[:div {:class "comment"}
 [:p
  "Do you have a comment? Feel free to send me an "
  [:a {:href "mailto:nebojsa.stricevic@gmail.com"} "email"]
  " or message me at " (link "@nstricevic" "http://twitter.com/nstricevic") "."]]
