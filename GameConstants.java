/**
*Patrick and Sean
*5/20/17
* This class holds all of the constants needed for the game
* Inspiration for this class came from The Eric Roberts CS 106A Breakout Assignment
* Breakout.java file
*
*/


import java.awt.*;

public class GameConstants{
  
   public static boolean isRunning = true;
   public static boolean gameReset = false;
   
   //String constants for messages
   final static String won = "Congrats Bud you won!";
   final static String lost = "Sorry Bud you lost!";


   //constants used for the brick
   static int BRICK_WIDTH = 130; //80;
   final static int BRICK_LENGTH = 50;
   static int NUM_ROWS = 5;
   final static int NUM_BRICKS = (GameConstants.WINDOW_SIZE-50)/GameConstants.BRICK_WIDTH;
      
   
   //constants used for the paddle
   final static int PADDLE_WIDTH = 80;
   final static int PADDLE_LENGTH = 15;
   final static int PADDLE_FROM_BOTTOM = 100;
   
   //constants used for the ball
   final static int BALL_DIAMETER = 15;
   final static Velocity INITIAL_BALL_VELOCITY = new Velocity((int)(Math.random()*5)+1, 2);
   final static int BALL_START_POS = 400;
   final static int WINDOW_SIZE = 700;
   final static int GAME_SPEED = 10;
   
   //this array keeps track of what color to use for each brick
   final static Color[] COLORS = {Color.RED,Color.ORANGE,Color.YELLOW,
                   Color.GREEN, Color.BLUE, Color.CYAN, Color.PINK};
   
   //all of the sounds for the game
   static EasySound iDubbbz = new EasySound("Hey_Thats_Pretty_Good_-_iDubbbz_Sound_Effect_HD_.wav");
   static EasySound hitMarker = new EasySound("hit_marker_Sound_Effect.wav");
   static EasySound loss = new EasySound("RIP.wav");
   static EasySound ring = new EasySound("Sonic_Ring_Sound.wav");
   static EasySound faster = new EasySound("goFast.wav");
   static boolean soundAlreadyPlayed = false;
   static boolean soundPlaying = false;
   
}