import javax.swing.*;

public class MileStoneTest extends JPanel
{
   public static void main (String [] args)
   {
      MileStoneTest myPanel = new MileStoneTest();
      JFrame application = new JFrame();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add(myPanel);
      application.setSize( 300, 300 );
      application.setVisible(true);
   }
}
