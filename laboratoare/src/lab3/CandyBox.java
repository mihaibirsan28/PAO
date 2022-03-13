package lab3;

public abstract class CandyBox {
    protected String flavor, origin;

    CandyBox() {
        this.flavor = "Nothing";
        this.origin = "Nothing";
    }

    CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public abstract double getVolume();

    @Override
    public String toString() {
        return "Flavor: " + this.flavor + " and origin: " + this.origin;
    }

}
