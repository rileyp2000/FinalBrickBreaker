/**
*Patrick and Sean
*5/20/17
*This class sets up the board with the bricks, paddle, and ball
*all in their starting position
*
*/

import javax.swing.*;
import java.awt.*;

public class SetupBoard extends JPanel{
   Bricks b;
   Paddle p = new Paddle((GameConstants.WINDOW_SIZE/2)- GameConstants.PADDLE_WIDTH/2,
               GameConstants.WINDOW_SIZE - GameConstants.PADDLE_FROM_BOTTOM);
   Ball ball;
   
   
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
      makeBricks(g);
      makePaddleAndBall(g);
   
   }
   //creates the array of bricks for use on the board and paints them   
   public void makeBricks(Graphics g){
      b = new Bricks();
      b.paint(g);
      
   }
   //draws the paddle and ball on the screen
   public void makePaddleAndBall(Graphics g){
   //   p = new Paddle((GameConstants.WINDOW_SIZE/2)- GameConstants.PADDLE_WIDTH/2,
   //          GameConstants.WINDOW_SIZE - GameConstants.PADDLE_FROM_BOTTOM);
      p.paint(g);
      
      
      ball = new Ball();
      ball.paint(g);
   
   }
   
   
//    public static void main(String[] args) {
//    	
//       JFrame frame = new JFrame("Breakout!");
//       SetupBoard dr = new SetupBoard();
//       
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       frame.setSize(700,700);
//       frame.add(dr);
//       frame.setVisible(true);
//    
//    }


}