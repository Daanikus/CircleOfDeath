import java.util.*;

public class Deck {
  
  private static Card[] deck = new Card[52];
  private static int cardCount = 0;
  private static ArrayList<Card> cardsDealt = new ArrayList<Card>();
  
  public Deck() {
    createCards("Hearts");
    createCards("Diamonds");
    createCards("Spades");
    createCards("Clubs");
  }
  
  public void createCards (String suit) {
    for (int count = 1; count <= 13; count++) {
      deck[cardCount] = new Card (suit, count);
      cardCount++;
    }
  }
  
  public void printDeck () {
    for (int i = 0; i < 52; i++) {
      System.out.println(deck[i].getValue() + " of " + deck[i].getSuit());
    }
  }
  
  public Card newCard () {
    Random rand = new Random (); 
    Card card =  deck[rand.nextInt(52)];
    if (!cardsDealt.contains(card)) {
      cardsDealt.add(card);
      return card;
    }
    else {
      return newCard();
    }
  } 
  
  public int getCardsDealt() {
    return cardsDealt.size();
  }
}