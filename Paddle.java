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
   
   //draws a rectangle in the bottom center of the window
   public void paint(Graphics g){
      g.fillRect((GameConstants.WINDOW_SIZE/2)-40,
         GameConstants.WINDOW_SIZE - GameConstants.PADDLE_FROM_BOTTOM,
            GameConstants.PADDLE_WIDTH,GameConstants.PADDLE_LENGTH);  
   }

}