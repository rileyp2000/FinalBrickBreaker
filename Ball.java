/**
*Patrick and Sean
*5/20/17
*This class creates a ball to be used in the game
*
*/

import javax.swing.*;
import java.awt.*;

public class Ball extends java.awt.geom.Ellipse2D.Double {
  
   private Velocity v; 
   
   
   public Ball(){
      super(GameConstants.WINDOW_SIZE/2-GameConstants.BALL_DIAMETER/2,   
            GameConstants.BALL_START_POS, 
            GameConstants.BALL_DIAMETER/2, 
            GameConstants.BALL_DIAMETER/2);
      v = GameConstants.INITIAL_BALL_VELOCITY;
      
      //50-50 chance of making the initial  x component of velocity negative
      if((int)Math.random()*1==0)
         v.setVX(v.getVX()*-1.0);   
   }
   public void paint(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      g2.setStroke(new BasicStroke(3));
      g2.drawOval((int)super.getX(),(int)super.getY(), GameConstants.BALL_DIAMETER,GameConstants.BALL_DIAMETER);
   }
   
   
   
   public void moveBall(){
      
      super.setFrame(super.getX()+(int)v.getVX(), super.getY()+(int)v.getVY(), 
               GameConstants.BALL_DIAMETER/2, GameConstants.BALL_DIAMETER/2);   
      if(super.getY()+2*GameConstants.BALL_DIAMETER>=GameConstants.WINDOW_SIZE)
         GameConstants.isRunning = false;         
         //bounceVert();
      if(super.getY()<=0)
         bounceVert();
      if(super.getX()>=GameConstants.WINDOW_SIZE-GameConstants.BALL_DIAMETER)
         bounceHoriz();
      if(super.getX()<=0)
         bounceHoriz(); 
         
   }
 
   public void bounceVert(){
      v.setVY(v.getVY()*-1.0);
   }
   public void bounceHoriz(){
      v.setVX(v.getVX()*-1.0);
   }
}