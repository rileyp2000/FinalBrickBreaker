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
      super(GameConstants.WINDOW_SIZE/2-GameConstants.BALL_DIAMETER/2, 575, GameConstants.BALL_DIAMETER/2, GameConstants.BALL_DIAMETER/2);
   }
   public void paint(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      g2.setStroke(new BasicStroke(3));
      g2.drawOval((int)super.getX(),(int)super.getY(), GameConstants.BALL_DIAMETER,GameConstants.BALL_DIAMETER);
   }
   
   public void onScreen(){
   if(super.getX()+GameConstants.BALL_DIAMETER>=GameConstants.WINDOW_SIZE)
      bounceVert();
   if(super.getX()<=0)
      bounceVert();
   if(super.getY()+GameConstants.BALL_DIAMETER>=GameConstants.WINDOW_SIZE)
      bounceHoriz();
   if(super.getY()<=0)
      bounceHoriz();      
   }
   
   public void bounceVert(){
      v.setVY(v.getVY()*-1.0);
   }
   public void bounceHoriz(){
      v.setVX(v.getVX()*-1.0);
   }
}