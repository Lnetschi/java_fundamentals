package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Dolphin extends Animal {

    double clickVelocity;


    public Dolphin(double clickVelocity) {
        super("dolphin");
        this.clickVelocity = clickVelocity;
    }

    public double getClickVelocity() {
        return clickVelocity;
    }

    public void setClickVelocity(double clickVelocity) {
        this.clickVelocity = clickVelocity;
    }

    @Override
    public void move(){
        System.out.println("dolphin swimming");
    }

    @Override
    public String toString() {
        return super.toString()+ "Dolphin{" +
                "clickVelocity=" + clickVelocity +
                '}';
    }
}
