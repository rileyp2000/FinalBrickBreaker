import javax.swing.*;
import java.awt.*;

public class Ball extends java.awt.geom.Ellipse2D.Double {
   
   public void paint(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      g2.setStroke(new BasicStroke(3));
     
      g2.drawOval(GameConstants.WINDOW_SIZE/2-GameConstants.BALL_DIAMETER/2,
                     575,GameConstants.BALL_DIAMETER,GameConstants.BALL_DIAMETER);
   }

}