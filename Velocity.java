/**
*Patrick and Sean
*5/20/17
*This class defines the velocity of an object
*
*/

public class Velocity{
   private double vx, vy;
   
   public Velocity(){
      vx = (Math.random()*3.0+1.0);
      if((int)(Math.random()*1)==0){
         vx = -1.0*vx;
      }
      vy = GameConstants.INITIAL_SPEED;   
      
   }
   
   public double getVX(){
      return vx;
   }
      
   public double getVY(){
      return vy;
   }
   public void setVX(double v){
      vx =v;
   }
   public void setVY(double v){
      vy =v;
   }

}