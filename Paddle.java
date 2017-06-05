/**
*Patrick and Sean
*5/20/17
*This class creates a paddle for the game
*
*
*/

import javax.swing.*;
import java.awt.*;

public class Paddle extends Rectangle{
   
   public Paddle(int x, int y){
      super(x, y,GameConstants.PADDLE_WIDTH,   GameConstants.PADDLE_LENGTH);
   }
   
   
   //draws a rectangle in the bottom center of the window
   public void paint(Graphics g){
      g.fillRect(x, y, GameConstants.PADDLE_WIDTH,GameConstants.PADDLE_LENGTH);  
   }
   
   public void setLocation(int xx){
      setLocation(xx, y);
   }
   
   public void checkHit(Ball b){
      if ((b.getBounds2D()).intersects(this)) {
         
         int ballLeft = (int) b.getX();
         int ballHeight = (int) b.getHeight();
         int ballWidth = (int) b.getWidth();
         int ballTop = (int) b.getY();
         
         Point pointRight = new Point(ballLeft + ballWidth + 1, ballTop);
         Point pointLeft = new Point(ballLeft - 1, ballTop);
         Point pointTop = new Point(ballLeft, ballTop - 1);
         Point pointBottom = new Point(ballLeft, ballTop + ballHeight + 1);
         
         
         if (this.contains(pointRight)) {
            b.bounceHoriz();
            GameConstants.hitMarker.play();
            
         } 
         else if (this.contains(pointLeft)) {
            b.bounceHoriz();
            GameConstants.hitMarker.play();
            
            
         }
            
         else if (this.contains(pointTop)) {
            b.bounceVert();
            GameConstants.hitMarker.play();
            
            
         } 
         else if (this.contains(pointBottom)) {
            b.bounceVert();
            GameConstants.hitMarker.play();
         }
      
      
      
      }  
   }
}