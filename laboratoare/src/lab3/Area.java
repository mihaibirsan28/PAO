package lab3;

public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    Area() {
        this.candyBag = null;
        this.street = "None";
        this.number = -1;
    }

    Area(CandyBag candyBag, String street, int number) {
        this.candyBag = candyBag;
        this.street = street;
        this.number = number;
    }

    public void printAddress() {
        System.out.println(this.street + " no." + this.number + " :");
        for (CandyBox candyBox : this.candyBag.getCandyBoxes()) {
            System.out.println(candyBag.toString());
        }
    }

    public CandyBag getCandyBag() {
        return candyBag;
    }

    public void setCandyBag(CandyBag candyBag) {
        this.candyBag = candyBag;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
