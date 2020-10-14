package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Bear extends Animal{

    private int roarIntensity;

    public Bear(int roarIntensity) {
        super.setType("bear");
        this.roarIntensity = roarIntensity;
    }

    public int getRoarIntensity() {
        return roarIntensity;
    }

    @Override
    public void move() {
        System.out.println("bear walking");
    }

    @Override
    public String toString() {
        return super.toString()+ "Bear{" +
                "roarIntensity=" + roarIntensity +
                '}';
    }
}
