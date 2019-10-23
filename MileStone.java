import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JFrame;

public class MileStone extends JPanel {
   public void paintComponent(Graphics g) {
      int breadth = getWidth();
      int height = getHeight();
      int xVal, yVal;
      int countLoop = 1;
      int countX = 1;
      int countY = 1;
      super.paintComponent(g);
      xVal = breadth / 15;
      yVal = height / 15;
      /* lines from top-left */
      g.drawLine(0, 0, 0, height);
      while (countLoop < 15) {
         g.drawLine(0, 0, xVal * countX, height - yVal * countY);
         ++countLoop;
         ++countX;
         ++countY;
      }
      /* lines from top-right */
      countLoop = countX = countY = 1;
      g.drawLine(breadth, 0, breadth, height);
      while (countLoop < 15) {
         g.drawLine(breadth, 0, breadth - xVal * countX, height - yVal * countY);
         ++countLoop;
         ++countX;
         ++countY;
      }
      /* lines from bottom-left */
      countLoop = countX = countY = 1;
      g.drawLine(0, height, breadth, height);
      while (countLoop < 15) {
         g.drawLine(0, height, breadth - xVal * countX, height - yVal * countY);
         ++countLoop;
         ++countX;
         ++countY;
      }
      /* lines from bottom-right */
      countLoop = countX = countY = 1;
      g.drawLine(breadth, height, 0, height);
      while (countLoop < 15) {
         g.drawLine(breadth, height, xVal * countX, height - yVal * countY);
         ++countLoop;
         ++countX;
         ++countY;
      }
   }
}
