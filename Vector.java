//Patrick and Sean

public class Vector{
   private double xComp,yComp;
   
   public Vector(double dir, double amount){
      setDirection(dir);
      setAmount(amount);   
   }
   
   public double getX(){
      return xComp;
   }
   public void setX(double xx){
      xComp = xx;
   }
      
   public double getY(){
      return yComp;
   }
   public void setY(double y){
      yComp = y;
   }
      
      
      
   public double getAmount(){
      return Math.sqrt(xComp*xComp + yComp*yComp);
   }
   
   public double getDirection(){
      return Math.atan2(getY(),getX());
   }
      
   
   
   public void setDirection(double d){
      double amt = getAmount();
      setX(Math.cos(d)*amt);
      setY(Math.sin(d)*amt);
   }
      
   public void setAmount(double a){
      double oldAmt = getAmount();
           
      xComp *= a / oldAmt;
      yComp *= a / oldAmt;         
         
   }

}