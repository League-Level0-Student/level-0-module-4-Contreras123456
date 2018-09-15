PImage minecraft;
int x = 100;
int y = 500;
boolean isNear = true;
void setup(){
  size(500,500);
    minecraft = loadImage("minecraft.png");
     minecraft.resize(500,500);
  
  
}
void draw(){
  background(minecraft);
  PImage creeper;
  creeper=loadImage("creeper.png");
  creeper.resize(10,10); 
   
    image(creeper, x, y);
    if(isNear){
    if(mousePressed){
      x = mouseX;
      y = mouseY;
    
      isNear = false;
    }
    }
    if(mouseX<30&&mouseY<30){
      fill(55,240,0);
      ellipse(1,1,30,30);
    }
    else{
     fill(250,3,3);
      ellipse(mouseX,mouseY,30,30);
    }
    
}