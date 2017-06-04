//Patrick RIley
//This class represents the brick that is used to be broken by the ball
//it inherits the properites of the Rectangle class for use with collisions

import java.awt.*;
import javax.swing.*;

public class Brick extends Rectangle{
      //saves the color of the brick
   public Color color;
   public boolean isAlive;
   public boolean isVisible;
   
   //creates a rectangle with saved color and constant size 
   public Brick(int xx, int yy,Color col){
      super(xx,yy,GameConstants.BRICK_WIDTH,GameConstants.BRICK_LENGTH);
      color = col;
      isAlive = true;
      isVisible = true;
      
   }
    //paints the brick with a different thickness line and puts them into the rows
   public void paint(Graphics g){
      if(isAlive && isVisible){
         Graphics2D g2 = (Graphics2D)g;
         g2.setStroke(new BasicStroke(2));
         g2.setColor(color);
      //creates the filled brick
         g2.fillRect(x, y, 
                  GameConstants.BRICK_WIDTH, GameConstants.BRICK_LENGTH);
         g2.setColor(Color.BLACK);
      //outlines the brick
         g2.drawRect(x, y, 
                  GameConstants.BRICK_WIDTH, GameConstants.BRICK_LENGTH);
      }
   }
   
   public void checkHit(Ball b){
      if(this.isAlive){
         if ((b.getBounds2D()).intersects(this)) {
         
            int ballLeft = (int) b.getX();
            int ballHeight = (int) b.getHeight();
            int ballWidth = (int) b.getWidth();
            int ballTop = (int) b.getY();
         
            Point pointRight = new Point(ballLeft + ballWidth + 1, ballTop);
            Point pointLeft = new Point(ballLeft - 1, ballTop);
            Point pointTop = new Point(ballLeft, ballTop - 1);
            Point pointBottom = new Point(ballLeft, ballTop + ballHeight + 1);
         
         
            if (this.contains(pointRight)) {
               b.bounceHoriz();
            } 
            else if (this.contains(pointLeft)) {
               b.bounceHoriz();
            }
         
            if (this.contains(pointTop)) {
               b.bounceVert();
            } 
            else if (this.contains(pointBottom)) {
               b.bounceVert();            }
         
            this.isAlive = false;
            this.isVisible = false;
         }          
      
      }
      
   }
   public String toString(){
      return "Brick at: " + super.getX() + ", " + super.getY() + "; Color: " + color;
   }

}
