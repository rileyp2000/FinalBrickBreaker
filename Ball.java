/*Sean Gibbons
 *
 */
 
 
 import java.awt.Color;
 
 
public class Ball{
   private int x, y;
   private int radius;
 
   public Ball(int x, int y){
      this.x = x;
      this.y = y;
   }
 
 //Basic movement methods to move ball the appropriate direction
   public void moveUp(int amount){
     if(amount>0){  
      y--;
      amount--;
      update();
      moveUp(amount);
   }
   }
 
   public void moveDown(int amount){
     if(amount>0){  
      y++;
      amount--;
      update();
      moveDown(amount);
   }
   }
   
   public void moveRight(int amount){
     if(amount>0){  
      x++;
      amount--;
      update();
      moveRight(amount);
   }
   }
 
   public void moveLeft(int amount){
     if(amount>0){  
      x++;
      amount--;
      update();
      moveLeft(amount);
   }
   }

}
