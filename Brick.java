//Patrick RIley
//This class represents the brick that is used to be broken by the ball

import java.awt.*;
import javax.swing.*;

public class Brick extends Rectangle{
      
   public Brick(int xx, int yy){
      super(xx,yy,GameConstants.BRICK_WIDTH,GameConstants.BRICK_LENGTH);
      
   }
    
   public void paint(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      g2.setStroke(new BasicStroke(2));
      
      g2.fillRect(x*GameConstants.BRICK_WIDTH+25, y*GameConstants.BRICK_LENGTH+15, 
                  GameConstants.BRICK_WIDTH, GameConstants.BRICK_LENGTH);
      g2.setColor(Color.BLACK);
      g2.drawRect(x*GameConstants.BRICK_WIDTH+25, y*GameConstants.BRICK_LENGTH+15, 
                  GameConstants.BRICK_WIDTH, GameConstants.BRICK_LENGTH);
   }
   public String toString(){
      return "Brick at: " + x + ", " + y;
   }

}
