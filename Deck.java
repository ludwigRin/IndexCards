import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();
    

    // getter
    public ArrayList<Card> getCards() {
        return this.cards;
    }

    // add cards
    public void addCard(Card card) {
        cards.add(card);
    }

    // remove card
    public void removeCard(Card card) {
        cards.remove(card);
    }

    // shuffle deck
    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    // save a deck to a file
    public void saveToFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (Card card : cards) {
            writer.write(card.getSubject() + ":" + card.getFrontContent() + ":" + card.getBackContent() + "\n");
            writer.close();
        }
    }

    public static void main(String[] args) {
        Card karte = new Card("Math", "+", "plus");
        Deck stack = new Deck();
        stack.addCard(karte);
        try {
            stack.saveToFile("test");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}