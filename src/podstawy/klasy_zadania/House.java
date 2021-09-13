package podstawy.klasy_zadania;

public class House {
    private final String address;
    private final Room kitchen, bathroom;
    private final Room[] rooms;

    public House(String address, Room kitchen, Room bathroom, Room[] rooms) {
        this.address = address;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public Room getKitchen() {
        return kitchen;
    }

    public Room getBathroom() {
        return bathroom;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public int getArea(){
        return kitchen.getArea() + bathroom.getArea() + getRoomArea();
    }

    private int getRoomArea(){
        int wynik = 0;
        for(Room room: rooms){
            wynik+=room.getArea();
        }
        return wynik;
    }
}
