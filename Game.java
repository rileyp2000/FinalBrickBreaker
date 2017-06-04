//patrick and sean 
//this creates the game enviornment 
//used the MouseMotionEventListener class as inspiration from the java api

import javax.swing.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;


public class Game implements MouseMotionListener{
   SetupBoard dr;
   EndGame end;
   JFrame frame;
   
   public Game(){
   
   	
      frame = new JFrame("Breakout!");
      dr = new SetupBoard();
      end = new EndGame();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(GameConstants.WINDOW_SIZE,GameConstants.WINDOW_SIZE);
      frame.add(dr);
      frame.setVisible(true);
      frame.setResizable(false);
      frame.addMouseMotionListener(this);
      
      
      //Handles the Timer tasks necessary for the ball movement
      Timer time = new Timer();
      BallTask task = new BallTask();   
      time.schedule(task, 0, GameConstants.GAME_SPEED);
      
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
   
   
   //Uses the TimerTask class to periodically move the ball and check it against obstacles
   private class BallTask extends TimerTask {
   
       
      public void run() {
         
         Ball b = dr.getBall();
         b.moveBall();  
         dr.getBricks().checkBricks(b);
         dr.getPaddle().checkHit(b);
         
         if(!GameConstants.isRunning){
            dr.setVisible(false);
            //end = new EndGame();
            frame.add(end);     
         
         }
         if(dr.b.isEmpty()){
            dr.setVisible(false);
            frame.add(end);     
         }
         
         dr.invalidate();
         dr.repaint();
      }
   }
   



}