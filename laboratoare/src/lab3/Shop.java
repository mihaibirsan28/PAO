package lab3;

public class Shop {
    public static void main(String[] args) {
        Milka milka1 = new Milka("vanilla", "Germany", 5, 8);
        Milka milka2 = new Milka("milk", "USA", 5,10);
        Milka milka3 = new Milka("oreo", "Belgium", 6, 7);
        Milka milka4 = new Milka("cherry", "Romania", 7 ,7);
        Lindt lindt1 = new Lindt("vanilla", "Italy", 10, 10, 7);
        Merci merci1 = new Merci("strawberry", "Spain", 15);

        System.out.println(merci1.toString());

        CandyBox[] candyBox1 = {milka1, milka2, milka3};
        CandyBox[] candyBox2 = {milka4, lindt1, merci1};

        CandyBag candyBag1 = new CandyBag(candyBox1);
        CandyBag candyBag2 = new CandyBag(candyBox2);

        Area area1 = new Area(candyBag1, "Bulevardul Iuliu Maniu", 10);
        Area area2 = new Area(candyBag2, "Str Brasov", 25);

        area1.printAddress();
        area2.printAddress();
    }
}
