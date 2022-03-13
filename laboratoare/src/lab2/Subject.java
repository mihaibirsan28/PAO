package lab2;

import java.util.Objects;

public class Subject {
    private Room room;
    private int noofStudents;
    private Person teacher;

    public Subject(){

    }

    public Subject(Room room, int noofStudents, Person person) {
        this.room = room;
        this.noofStudents = noofStudents;
        this.teacher = person;
    }

    public Room getRoom() {
        return room;
    }

    public int getNoofStudents() {
        return noofStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setNoofStudents(int noofStudents) {
        this.noofStudents = noofStudents;
    }

    public void setTeacher(Person person) {
        this.teacher = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return getNoofStudents() == subject.getNoofStudents() && getRoom() == subject.getRoom() && getTeacher() == subject.getTeacher();
    }

    @Override
    public int hashCode() {
        return Objects.hash(room, noofStudents, teacher);
    }

    @Override
    public String toString() {
        return this.teacher + " le preda " + this.noofStudents + " studenti, din sala " + this.room;
    }
}
