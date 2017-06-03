//Patrick RIley
//This class represents the brick that is used to be broken by the ball
//it inherits the properites of the Rectangle class for use with collisions

import java.awt.*;
import javax.swing.*;

public class Brick extends Rectangle{
      //saves the color of the brick
   public Color color;
   public boolean isAlive;
   
   //creates a rectangle with saved color and constant size 
   public Brick(int xx, int yy,Color col){
      super(xx,yy,GameConstants.BRICK_WIDTH,GameConstants.BRICK_LENGTH);
      color = col;
      isAlive = true;
      
   }
    //paints the brick with a different thickness line and puts them into the rows
   public void paint(Graphics g){
      if(isAlive){
         Graphics2D g2 = (Graphics2D)g;
         g2.setStroke(new BasicStroke(2));
         g2.setColor(color);
      //creates the filled brick
         g2.fillRect(x*GameConstants.BRICK_WIDTH+25, y*GameConstants.BRICK_LENGTH+15, 
                  GameConstants.BRICK_WIDTH, GameConstants.BRICK_LENGTH);
         g2.setColor(Color.BLACK);
      //outlines the brick
         g2.drawRect(x*GameConstants.BRICK_WIDTH+25, y*GameConstants.BRICK_LENGTH+15, 
                  GameConstants.BRICK_WIDTH, GameConstants.BRICK_LENGTH);
      }
   }
   
   public void checkHit(Ball b){
      
      if(this.isAlive){
         //checks if right side is hit
         if ((b.getY() >= super.getY()) && (b.getY() <= super.getY() + GameConstants.BRICK_LENGTH) 
         && (b.getX() >= super.getX() + GameConstants.BRICK_LENGTH)){
            b.bounceHoriz();
            this.isAlive = false;      
         
         }
         //checks if left side is hit
         if ((b.getY() >= super.getY()) && (b.getY() <= super.getY() + GameConstants.BRICK_LENGTH) 
         && (b.getX() <= super.getX())){
            b.bounceHoriz();
            this.isAlive = false;      
         
         }
         //checks if top is hit
         if ((b.getX() >= super.getX()) && (b.getX() <= super.getX()+GameConstants.BRICK_WIDTH) 
         && (b.getY()+GameConstants.BALL_DIAMETER >= super.getY())){      
            b.bounceVert();
            this.isAlive = false;      
         
         }
        //checks if bottom is hit
         if ((b.getX() >= super.getX()) && (b.getX() <= super.getX()+GameConstants.BRICK_WIDTH) 
         && (b.getY() >= super.getY()+GameConstants.BRICK_LENGTH)){      
            b.bounceVert();
            this.isAlive = false;      
         
         }
      }
   }
   public String toString(){
      return "Brick at: " + x + ", " + y + "; Color: " + color;
   }

}
