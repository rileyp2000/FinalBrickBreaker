/**
*Patrick and Sean
*5/20/17
*This class represents the bricks on the board
*
*
*/

import java.awt.*;
import java.util.Arrays;

public class Bricks{

   static Brick[][] bs = new Brick[GameConstants.NUM_ROWS][GameConstants.NUM_BRICKS];
   
   public void paint(Graphics g){
      for(int i = 0; i< GameConstants.NUM_ROWS; i++){
         for(int j = 0; j < (GameConstants.WINDOW_SIZE-50)/GameConstants.BRICK_WIDTH; j++){
            if(i<6)
               g.setColor(GameConstants.COLORS[i]);
            else
               g.setColor(GameConstants.COLORS[i-6]);
           
            Brick b = new Brick(j,i);
            bs[i][j] = b;
            b.paint(g);  
         }
      }
   }
   public String toString(){
      for(Brick[] row: bs){
         for(Brick b: row){
            System.out.println(b);
         }
      }
      return "";
   }
   

}