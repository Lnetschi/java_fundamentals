package labs_examples.objects_classes_methods.labs.objects;

import java.util.Arrays;

public class AirplaneLab {

    public static void main(String[] args) {

        Fuel fuel = new Fuel(256.3, "full");
        Passengers passengers = new Passengers("Joe", "Smith", 36);
        Seats seats = new Seats(11, 'a', true);
        Windows windows = new Windows(25,15);
        Plane myPlane = new Plane("Delta", passengers, seats, windows, fuel);


        System.out.println("A passenger will be flying today on " + myPlane.airlineName + " airlines. His name is " + passengers.firstName + " " + passengers.lastName +
                " and he is " + passengers.age + " years old. He is assigned to seat " + seats.seatNumber + seats.seatLetter + " which is a "
                + seats.isExitRow + " exit row. The window he is next to is " + windows.height + " inches height by " + windows.width + " inches width. The fuel capacity of the plane is "
                + fuel.fuelCapacity + " and the current fuel level is " + fuel.currentFuelLevel + ".");


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



 class Passengers {

    String firstName;
    String lastName;
    int age;

     public Passengers(String firstName, String lastName, int age) {
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

class Seats {

    int seatNumber;
    char seatLetter;
    boolean isExitRow;

    public Seats(int seatNumber, char seatLetter, boolean isExitRow) {
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

class Windows {

    int height;
    int width;

    public Windows(int height, int width) {
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
    Passengers passengers;
    Seats seats;
    Windows windows;
    Fuel fuel;

    public Plane(String airlineName, Passengers passengers, Seats seats, Windows windows, Fuel fuel) {
        this.airlineName = airlineName;
        this.passengers = passengers;
        this.seats = seats;
        this.windows = windows;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Plane{" +
                ", airlineName='" + airlineName + '\'' +
                ",\n passengers=" + passengers +
                ",\n seats=" + seats +
                ",\n windows=" + windows +
                ",\n fuel=" + fuel +
                '}';
    }
}








