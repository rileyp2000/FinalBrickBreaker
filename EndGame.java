//this class displays the screen after the game ends

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class EndGame extends SetupBoard{
   
   public JButton reset; 
   
//inspired by the code from the netbeans editor
public EndGame(){
        reset = new JButton("Reset");
        reset.setAlignmentY(0.0F);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(reset, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(reset, GroupLayout.PREFERRED_SIZE, 70,GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        }   
//    public EndGame(){
//       setLayout(new BoxLayout(this ,BoxLayout.X_AXIS));
//      
//       reset = new JButton("Reset");  
//       JButton b1 = new JButton ("Reaet");  
//       JButton b2 = new JButton ("Reaet");
//       JButton b3 = new JButton ("Reaet");
//       JButton b4 = new JButton ("Reaet");
// 
//       reset.addActionListener(new ResetButtonListener());
//      
//       b1.setAlignmentX(Component.CENTER_ALIGNMENT);
//       b2.setAlignmentX(Component.CENTER_ALIGNMENT);
//       b3.setAlignmentX(Component.CENTER_ALIGNMENT);
//       b4.setAlignmentX(Component.CENTER_ALIGNMENT);
//       reset.setAlignmentX(Component.CENTER_ALIGNMENT);
//       add(b1);
//       add(b2);
//       add(b3);
//       add(b4);
//       add(reset);
//       
//    }
   
   
   
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