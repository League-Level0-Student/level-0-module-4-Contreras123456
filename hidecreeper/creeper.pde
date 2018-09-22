 PImage creeper;
PImage minecraft;
int x = 100;
int y = 100;
boolean isNear = true;
void setup(){
  size(500,500);
    minecraft = loadImage("minecraft.png");
     minecraft.resize(500,500);
     creeper=loadImage("creeper.png");
  creeper.resize(10,10);
  
  
}
void draw(){
  background(minecraft);
  
   
    image(creeper, x, y);
    
    if(mousePressed){
      x = mouseX;
      y = mouseY;
    
      isNear = false;
    }
    
    if(mouseX<30&&mouseY<30){
      fill(55,240,0);
      ellipse(1,1,30,30);
    }
    
    else if(isNear(mouseX, x) && isNear(mouseY, y)){
      fill(55,240,0);
      ellipse(mouseX,mouseY,30,30);
      text("You Won!!!",x,y);
      print("memes");
    }else{
     fill(250,3,3);
      ellipse(mouseX,mouseY,30,30);}
    }  
   boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}



    



 