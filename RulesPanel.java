import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.awt.event.*;

public class RulesPanel extends JPanel {
  
  
  protected JTextField enterRule = new JTextField (20);
  protected JButton addRule = new JButton ("Add Rule");
  protected JLabel ruleLabel, previousRule;
  protected Scanner scan;
  protected Rules rules1;
  
  
  public RulesPanel () {
    setLayout(new GridLayout(5, 5));
    String rule = "";
    rules1 = new Rules();
    previousRule = new JLabel("");
    RuleListener ruleListen = new RuleListener();
    addRule.addActionListener(ruleListen);
    setFont (new Font("Verdana", Font.BOLD, 20));
    setPreferredSize(new Dimension (500, 400));
    setBackground(Color.GRAY);
    ruleLabel = new JLabel ("Enter rule for card " + (rules1.getRuleCount()));
    add(ruleLabel);
    add(enterRule);
    add(addRule);
    add(previousRule);
  }
  
  
  
  private class RuleListener implements ActionListener {
    
    public void actionPerformed (ActionEvent e) {
      
      if (e.getSource() == addRule && rules1.getRuleCount() < 13) {
        rules1.setRule(enterRule.getText());
        ruleLabel.setText("Enter rule no. " + (rules1.getRuleCount()));
        previousRule.setText(rules1.getRule(rules1.getRuleCount() - 1));
        enterRule.setText("");
      }
      else if (rules1.getRuleCount() >= 13) {
        ruleLabel.setText("All rules entered");
        rules1.printRulesToConsole();
      }
    }
  }
}