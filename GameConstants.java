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
   //constants used for the brick
   final static int BRICK_WIDTH = 50;
   final static int BRICK_LENGTH = 30;
   final static int NUM_ROWS = 10;
   final static int NUM_BRICKS = (GameConstants.WINDOW_SIZE-50)/GameConstants.BRICK_WIDTH;
   
   //constants used for the paddle
   final static int PADDLE_WIDTH = 80;
   final static int PADDLE_LENGTH = 15;
   final static int PADDLE_FROM_BOTTOM = 100;
   
   //constants used for the ball
   final static int BALL_DIAMETER = 15;
   
   final static int WINDOW_SIZE = 700;
   
   //this array keeps track of what color to use for each brick
   final static Color[] COLORS = {Color.RED,Color.ORANGE,Color.YELLOW,
                   Color.GREEN, Color.BLUE, Color.CYAN, Color.PINK};

}