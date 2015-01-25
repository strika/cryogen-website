; @title  default title
; @format html5

[:head
 [:meta {:charset (:charset site)}]
 [:meta {:name    "viewport"
         :content "width=device-width, initiali-scale=1.0, user-scalable=yes"}]

 [:title
  (if (= (:title site) "home")
    (:site-title site)
    (str (:site-title site) " - " (:title site)))]

 [:link {:rel   "shortcut icon"
         :href  "/favicon.ico"}]
 [:link {:href  "/atom.xml"
         :rel   "alternate"
         :title (:title site)
         :type  "application/atom+xml"}]

 (css [(:css site ()) "/css/cv.css"])
 (css {:media "only screen and (max-device-width:480px)"} (:device-css site))]
; /head

[:body

 (container
  [:nav {:class "navbar navbar-default" :role "navigation"}
    [:div {:class "container-fluid"}
      [:div {:class "navbar-header"}
        [:button {:type "button" :class "navbar-toggle" :data-toggle "collapse" :data-target "#bs-example-navbar-collapse-1"}
          [:span {:class "sr-only"} "Toggle navigation"]
          [:span {:class "icon-bar"}]
          [:span {:class "icon-bar"}]
          [:span {:class "icon-bar"}]]]

      [:div {:class "collapse navbar-collapse" :id "bs-example-navbar-collapse-1"}
        [:ul {:class "nav navbar-nav navbar-right"}
          [:li [:a {:href "/"} "Home"]
          [:li [:a {:href "/cv.html"} "CV"]]]]]]]

    contents
 
   [:footer
    [:small "&copy; 2015 Nebojša Stričević"]])
 ; /container

 (js ["/js/prettify.js"
      "/js/lang-clj.js"
      (:js site ())])]
; /body
