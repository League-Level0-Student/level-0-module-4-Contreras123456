import ddf.minim.*;
AudioSample woohooSound;
boolean playSound = true;
PImage donkey;
  PImage tail;

   int x;
  int y;
  void setup(){
  Minim minim = new Minim(this);
  woohooSound  = minim.loadSample("woohoo.wav");
  size(550,406);
  

  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png.png");
 
}

void draw(){
    if(dist(0, 0, mouseX, mouseY) < 30){
    //image(donkey,0,0);
    background (donkey);
  }
  else{
    background(0,0,0);
    
  }
  
  
  
  rect(0,0,30,30);
  rect(454,75,40,40);
if(mousePressed){
   x=mouseX-30;
   y=mouseY-20;
  
}
image(tail,x,y);
//if(x>=434 && x<=474 && y>=55 && y<=95){
 if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
}
else{
  println(x);
  println(y);
}
  
}