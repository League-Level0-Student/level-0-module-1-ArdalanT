void setup() {
    size(500, 500);
}
void draw() {
    background(255, 255, 255);
    noStroke();
    fill(255,0,0);
    ellipse(150, 200, 150, 150);
    fill(255,0,0);
    ellipse(212, 200, 150, 150);
    fill(8,90,5);
    rect(176, 103, 12, 32);
    if(mousePressed){
     fill(255,255,255);
      ellipse(100,200,80,80);
    }
}