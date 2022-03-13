package lab3;

import java.util.Objects;

public class Lindt extends CandyBox{
    private int length, width, heigth;

    Lindt() {
        super();
        this.heigth = -1;
        this.length = -1;
        this.width = -1;
    }

    Lindt(String flavor, String origin) {
        super(flavor, origin);
        this.heigth = -1;
        this.length = -1;
        this.width = -1;
    }

    Lindt(int length, int width, int heigth) {
        super();
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    Lindt(String flavor, String origin, int length, int width, int heigth) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getVolume() {
        return this.length * this.width * this.heigth;
    }

    @Override
    public String toString() {
        return "The " + this.origin + " " + this.flavor + " has volume " + String.format("%.2f", this.getVolume());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Merci)) return false;
        Lindt lindt = (Lindt) o;
        return getVolume() == lindt.getVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, heigth);
    }
}
