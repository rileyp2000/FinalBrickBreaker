/**
*Patrick and Sean
*5/20/17
*This class holds all of the constants needed for the game
*
*
*/


import java.awt.*;

public class GameConstants{

   final static int BRICK_WIDTH = 35;
   final static int BRICK_LENGTH = 20;
   final static int NUM_ROWS = 10;
   final static int NUM_BRICKS = (GameConstants.WINDOW_SIZE-50)/GameConstants.BRICK_WIDTH;
   
   final static int PADDLE_WIDTH = 80;
   final static int PADDLE_LENGTH = 15;
   final static int PADDLE_FROM_BOTTOM = 100;
   
   final static int BALL_DIAMETER = 20;
   
   final static int WINDOW_SIZE = 700;
   
   final static Color[] COLORS = {Color.RED,Color.ORANGE,Color.YELLOW,
                   Color.GREEN, Color.BLUE, Color.CYAN, Color.PINK};
   static Brick[][] bricks = new Brick[NUM_ROWS][NUM_BRICKS];

}