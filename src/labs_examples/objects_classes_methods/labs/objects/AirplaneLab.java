package labs_examples.objects_classes_methods.labs.objects;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AirplaneLab {

    public static void main(String[] args) {

        Fuel fuel = new Fuel(256.3, "full");
        fuel.setCurrentFuelLevel("empty");
        fuel.setFuelCapacity(123.4);

        Passenger joe = new Passenger("Joe", "Smith", 36);
        joe.setFirstName("joe");
        joe.setLastName("smith");
        joe.setAge(36);

        Passenger bob = new Passenger("Bob", "Smith", 36);
        bob.setFirstName("bob");
        bob.setLastName("smith");
        bob.setAge(36);

        Seat seat = new Seat(11, 'a', true);
        seat.setSeatNumber(11);
        seat.setSeatLetter('a');
        seat.setExitRow(true);

        Seat chair = new Seat(12, 'b', false);
        chair.setSeatNumber(12);
        chair.setSeatLetter('b');
        chair.setExitRow(false);

        Window window = new Window(25,15);
        window.setHeight(26);
        window.setWidth(16);

        Window glass = new Window(30,20);
        glass.setHeight(31);
        glass.setWidth(21);

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

    private double fuelCapacity;
    private String currentFuelLevel;

    double getFuelCapacity() {
        return fuelCapacity;
    }

    void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    String getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    void setCurrentFuelLevel(String currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    Fuel(double fuelCapacity, String currentFuelLevel) {
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

    private String firstName;
    private String lastName;
    private int age;

     Passenger(String joe, String smith, int i) {
     }

     String getFirstName() {
         return firstName;
     }

     void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     String getLastName() {
         return lastName;
     }

     void setLastName(String lastName) {
         this.lastName = lastName;
     }

     int getAge() {
         return age;
     }

     void setAge(int age) {
         this.age = age;
     }

     @Override
     public String toString() {
         return "Passenger{" +
                 "firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                 ", age=" + age +
                 '}';
     }
 }

class Seat {

    private int seatNumber;
    private char seatLetter;
    private boolean isExitRow;

    int getSeatNumber() {
        return seatNumber;
    }

    void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    char getSeatLetter() {
        return seatLetter;
    }

    void setSeatLetter(char seatLetter) {
        this.seatLetter = seatLetter;
    }

    boolean isExitRow() {
        return isExitRow;
    }

    void setExitRow(boolean exitRow) {
        isExitRow = exitRow;
    }

    Seat(int seatNumber, char seatLetter, boolean isExitRow) {
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

    private int height;
    private int width;

    int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    Window(int height, int width) {
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
    private String airlineName;
    private ArrayList<Passenger> passengers;
    private ArrayList<Seat> seats;
    private ArrayList<Window> windows;
    private Fuel fuel;

    String getAirlineName() {
        return airlineName;
    }

    void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    ArrayList<Seat> getSeats() {
        return seats;
    }

    void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    ArrayList<Window> getWindows() {
        return windows;
    }

    void setWindows(ArrayList<Window> windows) {
        this.windows = windows;
    }

    Fuel getFuel() {
        return fuel;
    }

    void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    Plane(String airlineName, ArrayList<Passenger> passengers, ArrayList<Seat> seats, ArrayList<Window> windows, Fuel fuel) {
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








