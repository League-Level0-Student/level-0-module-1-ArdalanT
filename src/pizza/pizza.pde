void draw(){

  PImage toppings = loadImage("pizza-ingredients-06-peppers.png");
  image(toppings,280,375);
   if(mousePressed){
      PImage pizza = loadImage("pizza-1.png");
    pizza.resize(500,500);
    image(pizza,250,270);
    PImage box= loadImage("box.png.jpg");
    }
  }
  void setup(){
    size(900,900);
    fill(247,210,150);
    stroke(247,210,150);
    ellipse(500,500,500,400);
    fill(255,0,0);
    ellipse(500,500,400,300);
    fill(245,235,161);
    ellipse(500,500,350,250);
   
    }
  