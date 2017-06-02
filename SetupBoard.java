/**
*Patrick and Sean
*5/20/17
*This class sets up the board with the bricks, paddle, and ball
*all in their starting position
*
*/
import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class SetupBoard extends JPanel {
   Bricks b = new Bricks();
   Paddle p = new Paddle((GameConstants.WINDOW_SIZE/2)- GameConstants.PADDLE_WIDTH/2,
               GameConstants.WINDOW_SIZE - GameConstants.PADDLE_FROM_BOTTOM);
   Ball ball = new Ball();
   
   public Bricks getBricks(){
      return b;
   }
   public Paddle getPaddle(){
      return p;
   }
   public Ball getBall(){
      return ball;
   }
   public void setPaddle(Paddle pad){
      p = pad;
   }   
   
   //draws the starting screen   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      b.paint(g);
      p.paint(g);
      ball.paint(g);
      if(!GameConstants.isRunning)
         loseGame(g);
      if(GameConstants.remainingBricks == 0)
         winGame(g);
        
   }
   
   public void loseGame(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      g.drawString("Sorry Bud you lose!", GameConstants.WINDOW_SIZE/2, GameConstants.WINDOW_SIZE/2);
   }
   
   public void winGame(Graphics g){
      g.drawString("Sorry Bud you Win!", GameConstants.WINDOW_SIZE/2, GameConstants.WINDOW_SIZE/2);
   }
   
   
   


}