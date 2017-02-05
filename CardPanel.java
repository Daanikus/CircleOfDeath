import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardPanel extends JPanel {
  
  protected JButton deal, newGame;
  protected JLabel cardValue, cardRule;
  protected Deck deck1 = new Deck();
  
  
  public CardPanel() {
    
    setLayout(new GridLayout(5, 5));
    ButtonListener listener = new ButtonListener();
    deal = new JButton ("Deal Card");
    newGame = new JButton ("New Game");
    cardValue = new JLabel ("Press button to deal a card");
    cardRule = new JLabel ();
    
    cardValue.setFont (new Font("Verdana", Font.BOLD, 20));
    setPreferredSize(new Dimension (500, 400));
    setBackground(Color.GRAY);
    
    add(deal);
    add(newGame);
    add(cardValue);
    add(cardRule);
    deal.addActionListener(listener);
    newGame.addActionListener(listener);
  }
  
  private class ButtonListener implements ActionListener {
    
    public void actionPerformed (ActionEvent e) {
      
      if (e.getSource() == deal && deck1.getCardsDealt() < 52) {
        Card card = deck1.newCard();
        cardValue.setText(card.toString());
        cardRule.setText(rules1.getRule(card.getRealValue()));
      }
      else if (e.getSource() == deal && deck1.getCardsDealt() != 52) {
        cardValue.setText("END OF DECK");
      }
      else if (e.getSource() == newGame) {
        RulesPanel rulesPanel = new RulesPanel();
        JFrame ruleFrame = new JFrame();
        System.out.println("newGame sourced");
        ruleFrame.add(rulesPanel);
        ruleFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ruleFrame.pack();
        ruleFrame.setVisible(true);
        
      }
      
    }
  }
}
