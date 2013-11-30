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
