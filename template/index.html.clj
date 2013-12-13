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
 [:h1 "Projects and experiments"]
 [:p {:id "practicioner"} "A practicioner should never stop practicing"]
 [:p (link "Langton's ant" "https://github.com/strika/ant")]
 [:p (link "Blue Hood" "https://github.com/strika/bluehood")]]
;/article

(js ["/js/ant/lib/underscore-min.js"
     "/js/ant/lib/raphael-min.js"
     "/js/ant/src/model/Ant.js"
     "/js/ant/src/model/AntFactory.js"
     "/js/ant/src/model/World.js"
     "/js/ant/src/view/WorldView.js"])

[:script
 "
  var paper = Raphael(document.getElementById('ant'), 800, 800),
      world = new World(),
      worldView = new WorldView(world, paper);
      antFactory = new AntFactory(world);

  var initAnt = function() {
    var ant = antFactory.buildRandomAnt();
    window.setInterval(function() { ant.move(); }, Math.random() * 1024);
  };

  setTimeout(initAnt, 1000);
  setTimeout(initAnt, 2000);
  setTimeout(initAnt, 3000);
  setTimeout(initAnt, 4000);
 
 "]
