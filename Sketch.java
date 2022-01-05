import processing.core.PApplet;

public class Sketch extends PApplet {


  /**
   * state global variables
   *  
   * */ 
  float circleY;
  float circleX;
  float ySpeed = 1;
  float light[] = {61,65,69,73,77};
  float starX[] = {5,44,30,25,28,15};
  float starY[] = {5,6,10,30,20,4};
  float starsize[] = {100,75,50,100,100,75};
  float r;
  float g;
  float b;
  float rl;
  float gl;
  float bl;
  float t = 0;
  boolean day=true ;
  
  
  

	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(500, 500);
    circleY = height/5*4;
    circleX = width/10;
  }
  
  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(r,g,b);
  }
  
  public void draw() {
    // clear out old frames
    background(r,g,b);
  
    // draw current frame based on state
    
    
    
    
    
    

    
  
    // modify state
    circleX = circleX + 1;
    circleY = circleY - ySpeed;
    
    if(day){
    //backgound colour
    r = circleY/3;
    g = 82+(400-circleY)/4;
    b = 47+(400-circleY)/2;
    }
    else{
      r=circleY/4;
      b=circleY/10;
      g=circleY/10;
    }

  
    // bounce off bottom
    
    
    if(circleY+25 > height) {
      ySpeed = ySpeed * -1;
      day=!day;
      }
    
    if(day){
    //draw sun
      fill(255,255,0);
      ellipse(100, circleY, 50, 50);
    // draw ground
      fill(0,255,0);
      rect(0, (height*3)/4, width, height);
    // draw house
      fill(255, 0, 0);
      rect(width/5*3,height/5*3,width/5,height/5);
    // houselights and streetlight colours
      rl=255;
      bl=255;
      gl=255;
    // draw light on streetlight
      fill(rl,gl,bl);
      stroke(0,0,0);
      ellipse(width/50*(85/2), height/50*(87/4),width/50*2,height/50*2);
    // draw the two posts of the streetlight
      fill(0,0,0);
      rect(width/50*47,height/5*2,width/50,height/50*20);
      rect(width/50*41,height/5*2,width/50*6,height/50);
      fill(rl,gl,bl,0);
    // draw the cloud
      fill(255,255,255);
      stroke(255,255,255);
      ellipse(circleX-4,height/5+7,width/20,height/20);
      ellipse(circleX-5,height/5-5,width/20,height/20);
      ellipse(circleX-3,height/5-5,width/20,height/20);
      ellipse(circleX-15,height/5+5,width/20,height/20);
      ellipse(circleX-13,height/5+5,width/20,height/20);
      ellipse(circleX+2,height/5+5,width/20,height/20);
    }
    else{
    // draw the stars
      fill(255,255,255,500-2*circleY);
      stroke(r,g,b);
      for(int i = 0; i<starX.length; i++){
      ellipse(width/50*starX[i],height/50*starY[i],width/starsize[i],height/starsize[i]);
      }
    // draw the moon
      fill(255,255,255);
      ellipse(140, circleY, 50, 50);
    // draw the invisible orverlapping circle
      fill(r,g,b);
      stroke(r,g,b);
      ellipse(120,circleY,50,50);
    // draw ground
      fill(0,255,0);
      rect(0, (height*3)/4, width, height);
    // draw house
      fill(255, 0, 0);
      rect(width/5*3,height/5*3,width/5,height/5);
    // houselights and streetlight colours
      rl=255;
      gl=255;
      bl=0+(circleY-100);
    // draw light on streetlight
      fill(rl,gl,bl);
      ellipse(width/50*(85/2), height/50*(87/4),width/50*2,height/50*2);
    // draw the two posts of the streetlight
      fill(0,0,0);
      stroke(0,0,0);
      rect(width/50*47,height/50*20,width/50,height/50*20);
      rect(width/50*41,height/5*2,width/50*6,height/50);
    // draw the houselights
      fill(rl,gl,bl,500-2*circleY);
      stroke(255,0,0);
      for(int i=0;i<light.length; i++){
      ellipse(width/50*(light[i]/2), height/50*31,width/50,height/50);
      
      }
      
      
      circleX=-15;
    }
    // makes sun and moon stop
      if(circleY == height/10){
        ySpeed = 0;
        t = t+1;
      // makes sun and moon move back down
        if(t == 150){
        ySpeed = -1;
        t=0;
        }
      }
    // draw tree trunk
      fill(165,42,42);
      stroke(0);
      rect(width/50*5,height/50*22,width/50*2,height/50*17);
    // draw leaves/green circles on the tree
      fill(0,255,0);
      stroke(0,255,0);
      ellipse(width/50*6,height/50*20,width/50*9,height/50*7);
      ellipse(width/50*4,height/50*22,width/50*9,height/50*7);
      ellipse(width/50*8,height/50*22,width/50*9,height/50*7);
      ellipse(width/50*2,height/50*24,width/50*9,height/50*7);
      ellipse(width/50*10,height/50*24,width/50*9,height/50*7);
      ellipse(width/50,height/50*26,width/50*9,height/50*7);
      ellipse(width/50*12,height/50*26,width/50*9,height/50*7);
      ellipse(width/50*6,height/50*28,width/50*9,height/50*7);
    
    // draw the door
      fill(165,42,42);
      stroke(0,0,0);
      rect(width/10*7,height/10*7,width/50*3,height/50*5);
    // draw the doorknob
      fill(0,0,255);
      ellipse(width/50*37,height/50*38,width/50,height/50);
    // draw the roof
    fill(200,200,200);
    rect(width/50*29,height/50*29,width/50*12,height/50*2);

    

    

    
    
    
  }
  
  // define other methods down here.


}