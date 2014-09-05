; @layout  default
; @title   post default title

[:div {:class "row"}
  [:article {:class "col-sm-8 col-sm-offset-2 content"}
   ; page header
   [:div {:class "page-header"}
    ; post title
    [:h1 (:title site)]
    ; post date
    (post-date)]

   ; contents
   [:div {:class "post"} contents]]]


[:div {:class "row"}
  [:div {:class "col-sm-8 col-sm-offset-2 content comment"}
   [:p
    "Do you have a comment? Feel free to send me an "
    [:a {:href "mailto:nebojsa.stricevic@gmail.com"} "email"]
    " or message me at " (link "@nstricevic" "http://twitter.com/nstricevic") "."]]]
