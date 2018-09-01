
void setup(){
  size(500,500);
}
 int leftEyeX=146;
  int yee = 150;
  int bigbirdX = 354;
  int elmo = 152;
void draw(){
  leftEyeX=mouseX;
  if(mouseX>201){
    leftEyeX=201-15;
  }
else if(mouseX<97){
  leftEyeX=97+15;
}
yee=mouseY;
if(mouseY<115){
  yee=130;
}
else if(mouseY>190){
  yee=175;
}
bigbirdX=mouseX;
if(mouseX>404){
  bigbirdX=390;
}if(mouseX<299){
  bigbirdX=315;
}
elmo=mouseY;
if(mouseY<110){
  elmo=125;
}
else if(mouseY>190){
  elmo=175;
}
background(255,255,255);
  fill(255,255,255);
  fill(255,255,255);
  ellipse(150,150,110,80);
  ellipse(350,150,110,80);
  fill(0,0,0);
  ellipse(bigbirdX,elmo,30,30);
  ellipse(leftEyeX,yee,30,30);
  if(mousePressed){
  System.out.println(mouseX+","+mouseY);
  }
  
  }