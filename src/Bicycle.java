public class Bicycle { // class header - note capital letter for class name

    private int numberOfGears; // field - access modifier (private). type (String), name of field (colour)
    private String colour;

    public Bicycle(String aColour, int aNumber){

        this.colour = aColour;
        this.numberOfGears = aNumber;
    }

    public String getColour() { // access modifier (public), type (String), name (getColour)

        return colour;

    }

    public int getNumberOfGears() {

        return numberOfGears;

    }
}
