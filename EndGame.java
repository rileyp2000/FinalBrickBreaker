//this class displays the screen after the game ends

import javax.swing.*;
import java.awt.*;

public class EndGame extends SetupBoard{

   public void paintComponent(Graphics g){
      super.paintComponent(g);  
      paintStuff(g);
      repaint();
      invalidate();
   }

   public void paintStuff(Graphics g){
      if(!GameConstants.isRunning)
         loseGame(g);
      if(b.isEmpty())
         winGame(g);
        
   }

   public void loseGame(Graphics g){
      Bricks.killBricks();        
      g.setColor(Color.CYAN);
      g.fillRect(0,0,700,700);
      g.setColor(Color.BLACK);
      g.setFont(new Font("Comic Sans MS", Font.PLAIN, 48));
      g.drawString("Sorry Bud you lose!", GameConstants.WINDOW_SIZE/4, GameConstants.WINDOW_SIZE/4);
   }
   
   public void winGame(Graphics g){
      g.setColor(Color.CYAN);
      g.fillRect(0,0,700,700);
      g.setColor(Color.BLACK);   
      g.setFont(new Font("Comic Sans MS", Font.PLAIN, 48));
      g.drawString("Sorry Bud you Win!", GameConstants.WINDOW_SIZE/4, GameConstants.WINDOW_SIZE/4);
      
   }


}