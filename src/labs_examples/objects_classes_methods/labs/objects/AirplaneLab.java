package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneLab {

    public static void main(String[] args) {

        Airplane myAirplane = new Airplane(256.3, "full");

        AirplaneColor myColor = new AirplaneColor("yellow");

        Plane myPlane = new Plane(myAirplane, "yellow", 6, 10, 5);


      System.out.println("This plane is " + myColor.color + " has " + myPlane.passengers
               + " passengers, has " + myPlane.seats + " seats, and has " + myPlane.windows + " windows. Its fuel capacity is "
                + myAirplane.fuelCapacity + " gallons and the current fuel level is at " + myAirplane.currentFuelLevel + ".");

        System.out.println(myPlane.toString());
    }
}

class Airplane {

    double fuelCapacity;
    String currentFuelLevel;

    public Airplane(double fuelCapacity, String currentFuelLevel) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel='" + currentFuelLevel + '\'' +
                '}';
    }
}

 class AirplaneColor {

    String color;

    public AirplaneColor(String color) {
        this.color = color;
    }

     @Override
     public String toString() {
         return "AirplaneColor{" +
                 "color='" + color + '\'' +
                 '}';
     }
 }

 class Passengers {

    int passengers;

     public Passengers(int passengers) {
        this.passengers = passengers;
    }

     @Override
     public String toString() {
         return "Passengers{" +
                 "passengers=" + passengers +
                 '}';
     }
 }

class Seats {

    int seats;

    public Seats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "seats=" + seats +
                '}';
    }
}

class Windows {

    int windows;

    public Windows(int windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "windows=" + windows +
                '}';
    }
}

class Plane {
    Airplane airplane;
    String color;
    int passengers;
    int seats;
    int windows;

    public Plane(Airplane airplane, String color, int passengers, int seats, int windows) {

        this.airplane = airplane;
        this.color = color;
        this.passengers = passengers;
        this.seats = seats;
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "airplane=" + airplane +
                ",\n color='" + color + '\'' +
                ",\n passengers=" + passengers +
                ",\n seats=" + seats +
                ",\n windows=" + windows +
                '}';
    }
}


