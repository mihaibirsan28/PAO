package lab3;

import java.util.Objects;

public class Merci extends CandyBox{
    private int length;

    Merci() {
        super();
        this.length = -100;
    }

    Merci(int length) {
        super();
        this.length = length;
    }

    Merci(String flavor, String origin) {
        super(flavor, origin);
        this.length = -100;
    }

    Merci(String flavor, String origin, int length) {
        super(flavor, origin);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getVolume() {
        return this.length * this.length * this.length;
    }

    @Override
    public String toString() {
        return "The " + this.origin + " " + this.flavor + " has volume " + String.format("%.2f", this.getVolume());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Merci merci = (Merci) o;
        return getVolume() == merci.getVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
