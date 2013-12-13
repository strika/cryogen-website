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
