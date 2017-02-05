import javax.swing.*;

public class CardsApp {
  
  public static void main (String[] args) {
    
    CardPanel cardView = new CardPanel();
    JFrame frame = new JFrame();
    
    frame.add(cardView);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
  }
}
    