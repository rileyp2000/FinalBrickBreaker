//patrick and sean 
//this creates the game enviornment 
//used the MouseMotionEventListener class as inspiration from the java api

import javax.swing.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

public class Game implements MouseMotionListener{
   SetupBoard dr;
   public Game(){
   
   	
      JFrame frame = new JFrame("Breakout!");
      dr = new SetupBoard();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(700,700);
      frame.add(dr);
      frame.setVisible(true);
      frame.setResizable(false);
      frame.addMouseMotionListener(this);   
   
   }
   
   public void mouseMoved(MouseEvent e) {
      Paddle p = dr.getPaddle();
      p.setLocation(e.getX());
      dr.setPaddle(p);
      dr.invalidate();
      dr.repaint();
   }
    
   public void mouseDragged(MouseEvent e) {
      Paddle p = dr.getPaddle();
      p.setLocation(e.getX());
      dr.setPaddle(p);
   }




}