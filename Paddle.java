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
      //checks if right side is hit
      if ((b.getY() >= super.getY()) && (b.getY() <= super.getY() + GameConstants.PADDLE_LENGTH) 
      && (b.getX() >= super.getX() + GameConstants.PADDLE_LENGTH)){
         b.bounceHoriz();
      }
      //checks if left side is hit
      if ((b.getY() >= super.getY()) && (b.getY() <= super.getY() + GameConstants.PADDLE_LENGTH) 
      && (b.getX() <= super.getX())){
         b.bounceHoriz();
      }
      //checks if top is hit
      if ((b.getX() >= super.getX()) && (b.getX() <= super.getX()+GameConstants.PADDLE_WIDTH) 
      && (b.getY()+GameConstants.BALL_DIAMETER >= super.getY())){      
         b.bounceVert();
      }
      
   }

}