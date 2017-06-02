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

}