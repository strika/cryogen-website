; @layout post
; @title Rake and Rails environment

(p "I've been using Rake daily for more than 2 years now,
   but I never went through a proper tutorial about Rake.
   Lately, I learned few basic things about Rake that made
   task dependency much more clear.")

(p "Simplest way to define a rake task is this:")

#-RUBY

task :my_task do
  # do some stuff
end

RUBY

[:br]

(p "If you need to run :prepare task before :my_task, this
   is the way to do it:")

#-RUBY

task :my_task => :prepare do
  # do some stuff
end

RUBY

[:br]

(p "And when you need to run several tasks before :my_task, you
   can use an array:")

#-RUBY

task :my_task => [:clean, :prepare, :setup_logging] do
  # do some stuff
end

RUBY

[:br]

(p "Rake is using Ruby's flexible syntax to create a comfortable DSL for writing tasks
   (that may look strange at first).")

[:h2 "Rails' :environment task"]

(p "A special task that you probably encountered before is the :environment task:")

#-RUBY

task :my_task => :environment do
  # do some stuff
end

RUBY

[:br]

(p "The :environment task loads the Rails' environment so all you code and gems are available
   in :my_task.")

[:h2 "When not to use :environment task"]

(p "If you're writing a task that needs to be executed periodically, in short
   intervals and doesn't depend on lots of other code, don't use :environment task.
   Load dependencies manually instead. Running a task that depends on :environment
   can take 20-30 seconds or more since it's starting the whole Rails and loading
   all gems for the environment.")
