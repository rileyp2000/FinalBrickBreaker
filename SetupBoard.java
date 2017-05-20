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


      
      
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      makeBricks(g);
      makePaddleAndBall(g);
   
   }
      
   public void makeBricks(Graphics g){
      Bricks b = new Bricks();
      b.paint(g);
      System.out.println(b);
//       for(int i = 0; i< rows; i++){
//          for(int j = 0; j < (GameConstants.WINDOW_SIZE-50)/GameConstants.BRICK_WIDTH; j++){
//             if(i<6)
//                g.setColor(GameConstants.COLORS[i]);
//             else
//                g.setColor(GameConstants.COLORS[i-6]);
//            
//             Brick b = new Brick(j,i);
//             GameConstants.bricks[i][j] = b;
//             b.paint(g);  
//          }
//       }
      
   }
   public void makePaddleAndBall(Graphics g){
      Paddle p = new Paddle();
      p.paint(g);
      
      Ball b = new Ball();
      b.paint(g);
   
   }
   
   
   public static void main(String[] args) {
   	
      JFrame frame = new JFrame("Breakout!");
      SetupBoard dr = new SetupBoard();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(700,700);
      frame.add(dr);
      frame.setVisible(true);
   
   }


}