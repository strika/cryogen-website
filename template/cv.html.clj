; @layout  cv
; @title   CV

[:div {:class "basic-info"}
 [:p
  [:span "info"]
  "Born in Sombor, Serbia on July 7, 1986"]
 [:p
  [:span "email"]
  (link "nebojsa.stricevic@gmail.com" "nebojsa.stricevic@gmail.com")]
 [:p
  [:span "phone"]
  "+381 64 375 10 85"]
 [:p
  [:span "github"]
  (link "http://github.com/strika" "http://github.com/strika")]]

[:div {:class "content"}
 [:div {:class "left"}
  [:p "Employment"]]
 [:div {:class "right"}
  [:p {:class "big"} "February 2012 - present"]
  [:p {:class "big"} "Software Engineer"]
  [:p "Rendered Text, " (link "http://renderedtext.com" "http://renderedtext.com") ", Novi Sad"]
  [:p "Web engineer, working close with clients on several web
      applications - most notably Reservation Genie, a restaurant reservation
      application (" (link "http://reservationgenie.com" "http://reservationgenie.com") ")."]
  [:p {:class "big"} "October 2010 - February 2012"]
  [:p {:class "big"} "Teaching Assistant"]
  [:p "Faculty of  Technical Sciences, University of Novi Sad"]
  [:p "Was responsible for teaching several software engineering related
      courses for students on third and fourth year of Bachelor studies"]]]

[:div {:class "content"} 
 [:div {:class "left"}
  [:p "Education"]]
 [:div {:class "right"} 
  [:p "October 2010 - February 2012: PhD Studies on Faculty of Technical Sciences,
      University of Novi Sad, Serbia, Unfinished"]
  [:p "2009-2010: Master in Electrical and Computer Engineering (Average grade 10.00/10.00),
      Faculty of Technical Sciences, University of Novi Sad, Serbia"]
  [:p "2005-2009: Bachelor With Honors in Electrical and Computer Engineering
      (Average grade 9.57/10.00), Faculty of Technical Sciences, University of Novi Sad, Serbia"]
  [:p "2001-2005: Computer Technician, Technical School in Sombor, Serbia, best student in generation"]]]

[:div {:class "content"} 
 [:div {:class "left"}
  [:p "Professional Skills"]]
 [:div {:class "right"} 
  [:p "Earned money with Ruby and Java. Played around with Clojure and several other languages."]
  [:p "Uses following development tools, frameworks and libraries in daily work: Vim, Git, Tmux, Ruby on Rails, RSpec, Cucumber."]
  [:p "Can handle JavaScript, jQuery, Jasmine, Backbone."]
  [:p "Has experience with software modeling languages and tools: UML,ECore, Sybase PowerDesigner, EMF."]
  [:p "Can comfortably work in any operating system, but prefers GNU/Linux."]]]

[:div {:class "content"}
 [:div {:class "left"}
  [:p "Other"]]
 [:div {:class "right"}
  [:p "Speaks Serbian and English."]]]
