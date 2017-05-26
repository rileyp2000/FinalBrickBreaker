/**
*Patrick and Sean
*5/20/17
*This class creates a ball to be used in the game
*
*/

import javax.swing.*;
import java.awt.*;

public class Ball extends java.awt.geom.Ellipse2D.Double {
  
   private Vector v; 
     
   public void paint(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      g2.setStroke(new BasicStroke(3));
     
      g2.drawOval(GameConstants.WINDOW_SIZE/2-GameConstants.BALL_DIAMETER/2,
                     400,GameConstants.BALL_DIAMETER,GameConstants.BALL_DIAMETER);
   }

}