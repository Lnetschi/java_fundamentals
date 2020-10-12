package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Waterpark {

    int maxOccupancy;
    String name;
    double waitTime;

    public Waterpark(int maxOccupancy, String name, double waitTime) {
        this.maxOccupancy = maxOccupancy;
        this.name = name;
        this.waitTime = waitTime;
    }

    public int peoplePerRaft(){
        return 0;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(double waitTime) {
        this.waitTime = waitTime;
    }
}
