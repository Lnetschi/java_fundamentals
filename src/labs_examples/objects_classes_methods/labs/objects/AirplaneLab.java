package labs_examples.objects_classes_methods.labs.objects;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AirplaneLab {

    public static void main(String[] args) {

        Fuel fuel = new Fuel(256.3, "full");
        Passenger joe = new Passenger("Joe", "Smith", 36);
        Passenger bob = new Passenger("Bob", "Smith", 36);
        Seat seat = new Seat(11, 'a', true);
        Seat chair = new Seat(12, 'b', false);
        Window window = new Window(25,15);
        Window glass = new Window(30,20);
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(joe);
        passengers.add(bob);
        ArrayList<Seat> seats = new ArrayList<>();
        seats.add(seat);
        seats.add(chair);
        ArrayList<Window> windows = new ArrayList<>();
        windows.add(window);
        windows.add(glass);

        Plane myPlane = new Plane("Allegiant", passengers, seats, windows, fuel);




        System.out.println(myPlane.toString());
    }
}

class Fuel {

    double fuelCapacity;
    String currentFuelLevel;

    public Fuel(double fuelCapacity, String currentFuelLevel) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel='" + currentFuelLevel + '\'' +
                '}';
    }
}



 class Passenger {

    String firstName;
    String lastName;
    int age;

     public Passenger(String firstName, String lastName, int age) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
     }

     @Override
     public String toString() {
         return "Passengers{" +
                 "firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                 ", age=" + age +
                 '}';
     }
 }

class Seat {

    int seatNumber;
    char seatLetter;
    boolean isExitRow;

    public Seat(int seatNumber, char seatLetter, boolean isExitRow) {
        this.seatNumber = seatNumber;
        this.seatLetter = seatLetter;
        this.isExitRow = isExitRow;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "seatNumber=" + seatNumber +
                ", seatLetter=" + seatLetter +
                ", isExitRow=" + isExitRow +
                '}';
    }
}

class Window {

    int height;
    int width;

    public Window(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}

class Plane {
    String airlineName;
    ArrayList<Passenger> passengers;
    ArrayList<Seat> seats;
    ArrayList<Window> windows;
    Fuel fuel;

    public Plane(String airlineName, ArrayList<Passenger> passengers, ArrayList<Seat> seats, ArrayList<Window> windows, Fuel fuel) {
        this.airlineName = airlineName;
        this.passengers = passengers;
        this.seats = seats;
        this.windows = windows;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "airlineName='" + airlineName + '\'' +
                ", passengers=" + passengers +
                ", seats=" + seats +
                ", windows=" + windows +
                ", fuel=" + fuel +
                '}';
    }
}








