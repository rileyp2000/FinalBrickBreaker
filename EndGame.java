//this class displays the screen after the game ends

import javax.swing.*;
import java.awt.*;

public class EndGame extends SetupBoard{
   private String outcome;

public EndGame(String out){
   outcome = out;
}

public void paintComponent(Graphics g){
      GameConstants.sop("hi");
      super.paintComponent(g);  
      paintStuff(g);
     // repaint();
     // invalidate();
}

public void paintStuff(Graphics g){
      g.setFont(new Font("Comic Sans MS", Font.PLAIN, 48));
      g.drawString("Sorry Bud you "+ outcome + "!", GameConstants.WINDOW_SIZE/4, GameConstants.WINDOW_SIZE/4);
      System.out.println("hello");
}




}