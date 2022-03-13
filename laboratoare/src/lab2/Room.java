package lab2;

import java.util.Objects;

public class Room {
    private int room_number;
    private String room_type;
    private int room_floor;

    public Room(){
        this.room_number = -1;
        this.room_type= "blank";
        this.room_floor = -1;
    }

    public Room(int room_number, String room_type, int room_floor) {
        this.room_number = room_number;
        this.room_type = room_type;
        this.room_floor = room_floor;
    }

    public int getRoom_number() {
        return room_number;
    }

    public String getRoom_type() {
        return room_type;
    }

    public int getRoom_floor() {
        return room_floor;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public void setRoom_floor(int room_floor) {
        this.room_floor = room_floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return getRoom_number() == room.getRoom_number() && getRoom_type() == room.getRoom_type() && getRoom_floor() == room.getRoom_floor();

    }

    @Override
    public int hashCode() {
        return Objects.hash(room_number,room_type,room_floor);
    }

    @Override
    public String toString() {
        return "Room " + room_type + ", number: " + room_number + " (floor: " + room_floor + ")";
    }
}
