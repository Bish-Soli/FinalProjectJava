import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> hand;
    int score;
    String name;

    /**
     * constructor for the Player class
     */
    public Player() {
        this.hand = new ArrayList<>();
        this.score = 0;
        this.name = "";

    }

    /**
     * this method is for describing all the information about the player
     */
    public void describe() {
        System.out.println("Name: " + this.name + ", Score: " + this.score);
        //Loop for the cards in the players hand
        for (Card card : this.hand) {
            card.describe(); //getting the index of the card and then calling the describe function in the Card superclass
        }
    }

    /**
     * flip function is for returning and removing the top card from the player hands
     *
     * @return the drawn card
     */
    public Card flip() {
        return hand.remove(hand.size() - 1);
    }

    /**
     * draw function giving the deck object and adding the top card from the deck into the player hand list
     *
     * @param deck calling the draw function and using the add to save the value in Hand list
     */
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    /**
     * this function is for increasing the score of the player in case of winning the round
     */
    public void incrementScore() {
        this.score += 1;
    }
}
