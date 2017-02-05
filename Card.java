public class Card {
  
  private String suit;
  private int value;
  
  public Card (String suit, int value) {
    this.suit = suit;
    this.value = value;
  }
  
  public String getSuit () {
    return suit;
  }
  
  public String getValue () {
    if (value == 1) return "Ace";
    if (value == 11) return "Jack";
    if (value == 12) return "Queen";
    if (value == 13) return "King";
    return Integer.toString(value);
  }
  
  public int getRealValue() {
    return value;
  }
  
  public void setValue (int value) {
    this.value = value;
  }
  
  public String toString () {
    return "The " + value + " of " + suit;
  }
}