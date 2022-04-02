public class Card {
    private int value;
    private String name;

    /**
     * constructor for the Card class
     */
    public Card() {
        this.name = "";
        this.value = 0;
    }

    /**
     * setter for the value
     *
     * @param x

     */
    public void setValue(int x) {
        this.value = x;
    }

    /**
     * setter for the name
     *
     * @param s
     */
    public void setName(String s) {

        //Switch case to modify the name of the card based on the value
        switch (this.value) {
            case (2) -> this.name = "Two" + s;
            case (3) -> this.name = "Three" + s;
            case (4) -> this.name = "Four" + s;
            case (5) -> this.name = "Five" + s;
            case (6) -> this.name = "Six" + s;
            case (7) -> this.name = "Seven" + s;
            case (8) -> this.name = "Eight" + s;
            case (9) -> this.name = "Nine" + s;
            case (10) -> this.name = "Ten" + s;
            case (11) -> this.name = "Jack" + s;
            case (12) -> this.name = "Queen" + s;
            case (13) -> this.name = "King" + s;
            case (14) -> this.name = "Ace" + s;
            default -> System.out.println("error");
        }
    }

    /**
     * getter for the value
     *
     * @return the value of the object
     */
    public int getValue() {
        return this.value;
    }

    /**
     * getter for the name
     *
     * @return
     */

    public String getName() {
        return  this.getName();
    }

    /**
     * function to print opn the screen the name of the card and its value
     */
    public void describe() {

        System.out.println("Name: " + this.getName() + " Value: " + this.getValue());

    }
}
