; @layout post
; @title Maximize Firefox window in a Cucumber Selenium scenario

(p "This is one of those \"can't make this scenario pass\" war stories.")

(p "The other day I was working on a piece of code that's using jQuery UI
   draggable and droppable interactions. And I just couldn't make the scenario
   pass. But I also couldn't stop working on it. One of reasons was that there was very
   similar scenario already passing.")

(p "Scenarios were using Capybara's "
   (link "#drag_to" "http://rubydoc.info/github/jnicklas/capybara/master/Capybara/Node/Element:drag_to")
   " method that makes testing drag and drop a breeze.
   After couple of hours of debugging and moving stuff around, I saw something
   interesting in the Firefox window that runs the test - during the drag and drop
   execution scroll bar moves.")

(p "The thing is that Firefox window was small. After drag started, small scrolling happened 
   to reveal the drop target. To make the scenario pass I had to make both the drag node and
   the drop node visible from the start.")

(p "Final solution was to maximize Firefox window just before drag is initiated:")

#-RUBY
page.driver.browser.manage.window.maximize
RUBY

[:br]

(p "Sometimes it pays off to follow how a test is executed in a browser window.
   And for some tests you really need to start \"thinking\" like a machine to
   understand what's going on.")
