public class Rules {
  
  private String[] ruleArray = new String[13];
  private int ruleCount = 1;
  
  public void setRule(String ruleIn) {
    ruleArray[ruleCount] = ruleIn;
    ruleCount++;
  }
  
  public int getRuleCount() {
    return ruleCount;
  }
  
  public String getRule (int value) {
    return ruleArray[value];
  }
  
  public void printRulesToConsole() {
    for (int i = 0; i < ruleArray.length; i++) {
      System.out.println("Rule " + ruleCount + ": " + ruleArray[i]);
    }
  }
}