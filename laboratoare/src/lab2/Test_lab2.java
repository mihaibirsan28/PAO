package lab2;

public class Test_lab2 {
    public static void main(String[] args) {
        Person pers1 = new Person();
        Person pers2 = new Person("Birsan", "Mihai", 20, 56765433, "student");
        pers1.setName("Marinescu");
        pers1.setSurname("Maria");
        pers1.setAge(19);
        pers1.setIdentity(5433267);
        pers1.setType("student");
        System.out.println(pers1);
        System.out.println(pers2);
        Room room1 = new Room(34,"dubla", 2);
        Room room2 = new Room();
        room2.setRoom_number(45);
        room2.setRoom_type("sigle");
        room2.setRoom_floor(4);
        System.out.println(room1);
        System.out.println(room2);

        Subject subj = new Subject(room2, 34, pers1);
        System.out.println(subj);

        Singleton sig = Singleton.getInstance();
        sig.showMessage();
    }
}
