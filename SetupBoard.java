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
   
   //draws the starting screen   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      makeBricks(g);
      makePaddleAndBall(g);
   
   }
   //creates the array of bricks for use on the board and paints them   
   public void makeBricks(Graphics g){
      Bricks b = new Bricks();
      b.paint(g);
      
   }
   //draws the paddle and ball on the screen
   public void makePaddleAndBall(Graphics g){
      Paddle p = new Paddle();
      p.paint(g);
      
      Ball b = new Ball();
      b.paint(g);
   
   }
   
   /**********Create driver class later********/
   public static void main(String[] args) {
   	
      JFrame frame = new JFrame("Breakout!");
      SetupBoard dr = new SetupBoard();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(GameConstants.WINDOW_SIZE,GameConstants.WINDOW_SIZE);
      frame.add(dr);
      frame.setVisible(true);
   
   }


}