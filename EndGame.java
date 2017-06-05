//this class displays the screen after the game ends

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class EndGame extends SetupBoard{
   
   public JButton reset; 
   
   
   public EndGame(){
      reset = new JButton("Reset");     
      reset.addActionListener(new ResetButtonListener());
      add(reset);
      
      JPanel panel = new JPanel(new BorderLayout());
      panel.add(this, BorderLayout.WEST);
   }
   
   
   
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
   
   
   
   private class ResetButtonListener
   implements ActionListener
   {
      public void actionPerformed(ActionEvent e) 
      { 
        
      }
   } 
   
   
   
   public void loseGame(Graphics g){
      Bricks.killBricks();        
      g.setColor(new Color(195, 195, 195));   
      g.fillRect(0,0,700,700);
      g.setColor(Color.BLACK);
      g.setFont(new Font("Comic Sans MS", Font.PLAIN, 48));
      g.drawString(GameConstants.lost, GameConstants.WINDOW_SIZE/7, GameConstants.WINDOW_SIZE/4);
   }
   
   public void winGame(Graphics g){
      g.setColor(Color.CYAN);
      g.fillRect(0,0,700,700);
      g.setColor(Color.BLACK);
      g.setFont(new Font("Comic Sans MS", Font.PLAIN, 48));
      g.drawString(GameConstants.won, GameConstants.WINDOW_SIZE/7, GameConstants.WINDOW_SIZE/4);
      
   }


}