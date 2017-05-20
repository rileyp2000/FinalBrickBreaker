import javax.swing.*;
import java.awt.*;

public class Paddle extends Rectangle{
   
   public void paint(Graphics g){
      g.fillRect((GameConstants.WINDOW_SIZE/2)-40,
         GameConstants.WINDOW_SIZE - GameConstants.PADDLE_FROM_BOTTOM,
            GameConstants.PADDLE_WIDTH,GameConstants.PADDLE_LENGTH);  
   }

}