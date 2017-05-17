//Patrick and Sean 

import java.util.Random;

public abstract class GameElement{
   private int x,y;
   private boolean isVisible;
            
    //getters and setters       
   public int getX(){
      return x;
   }
            
   public int getY(){
      return y;
   }
   
   public void setX(int xx){
      x = xx;
   }
   public void setY(int yy){
      y= yy;
   }
           
           
           
           
           
   public abstract void draw();
   
   public void move(Vector v){
      setX((int)Math.round(getX() + v.getX()));
      setY((int)Math.round(getY() + v.getY()));
   }
            
            



}