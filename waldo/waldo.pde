int yomom = 32;
int kermitsuicide = 302;
int baldi = 80;
int popeyes;
void setup() {
      PImage waldo = loadImage("waldo.jpg"); // 5. Change this to match your file name.
      size(768,432);
      image(waldo, 0, 0);
     doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
     woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}
void draw() {
  if(mousePressed){
  println("X: " + mouseX + " Y: " + mouseY);
  }
  if(mousePressed){
  if(mouseX>=yomom&&mouseX<=baldi&&mouseY<=357&&mouseY>=kermitsuicide){
    playWoohoo();
  }
  else{
    playDoh();
  }
  }
}
 void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;