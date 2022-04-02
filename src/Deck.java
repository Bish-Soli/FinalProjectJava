import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>(52);


    String[] typeOfCard = {"Spades", "Diamonds", "Hearts", "Clubs"};

    /**
     * constructor for the Deck
     */
    public Deck() {
        for (String s : typeOfCard) {
            for (int j = 2; j <= 14; j++) {
                Card card = new Card();
                card.setValue(j);
                card.setName(" of " + s);
                cards.add(card);

            }
        }
    }

    /**
     * shuffle() is a function to randomize the cards in the Deck
     */
    public void shuffle() {
        Collections.shuffle(this.cards);

    }

    /**
     * Draw is a function to return the top of the Deck which is size-1 card and remove it from the Deck
     *
     * @return the last card or the top card in the Deck
     */
    public Card draw() {
        return this.cards.remove(cards.size() - 1);
    }
}
