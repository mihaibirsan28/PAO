package lab3;

public class CandyBag {
    private CandyBox[] candyBoxes;

    CandyBag() {
        this.candyBoxes = null;
    }

    CandyBag(CandyBox[] candyBoxes) {
        this.candyBoxes = candyBoxes;
    }

    public CandyBox[] getCandyBoxes() {
        return candyBoxes;
    }

    public void setCandyBoxes(CandyBox[] candyBoxes) {
        this.candyBoxes = candyBoxes;
    }
}
