public class App {
    public static void main(String[] args) {

        Deck c = new Deck(); //declaring a Deck with variable c
        Player player1 = new Player(); //creating player 1
        player1.name = "Bishoy"; //set the name pf player 1
        Player player2 = new Player(); //creating player 2
        player2.name = "Marie"; //set the name of player 2
        c.shuffle(); // calling the shuffle method in the Deck class

        //for loop since I can't use While dividing based on even or odd the Deck between the two players
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(c);
            } else {
                player2.draw(c);
            }
        }
        //for loop to check the flipped card value and compare it between both players
        for (int i = 0; i < 26; i++) {
            //creating an object of Card because I couldn't use the methods of flip() each time in each comparison as it removes tha card each time
            Card player1Card = new Card();
            Card player2Card = new Card();
            player1Card = player1.flip(); //Saving the card for player 1 in a variable
            player2Card = player2.flip(); //Saving the card for player 2 in a variable

            //comparing the values of cards between the 2 cards

            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else {
                player2.incrementScore();
            }

        }

        //printing the players details on the console
        player1.describe();
        player2.describe();

        // comparing the scores to determine the winner and printing it on the console
        if (player1.score == player2.score) {
            System.out.println("Draw");
        } else if (player1.score > player2.score) {
            System.out.println("The winner is " + player1.name);
        } else {
            System.out.println("The winner is " + player2.name);
        }


    }
}
