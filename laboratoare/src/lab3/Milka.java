package lab3;

import java.util.Objects;

public class Milka extends CandyBox{
    private int radius, heigth;
    static final double pi = 3.14;

    Milka() {
        super();
        this.radius = -1;
        this.heigth = -1;
    }

    Milka(String flavor, String origin) {
        super(flavor, origin);
        this.radius = -1;
        this.heigth = -1;
    }

    Milka(int radius, int heigth) {
        super();
        this.radius = radius;
        this.heigth = heigth;
    }

    Milka(String flavor, String origin, int radius, int heigth) {
        super(flavor, origin);
        this.radius = radius;
        this.heigth = heigth;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getVolume() {
        return this.radius * Milka.pi * this.heigth;
    }

    @Override
    public String toString() {
        return "The " + this.origin + " " + this.flavor + " has volume " + String.format("%.2f", this.getVolume());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milka milka = (Milka) o;
        return getVolume() == milka.getVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, heigth);
    }
}
