package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Bird extends Animal {

    private boolean canFly;

    public Bird(boolean canFly) {
        super("bird");
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public void move(){
        System.out.println("bird flying");
    }

    @Override
    public String toString() {
        return super.toString()+ "Bird{" +
                "canFly=" + canFly +
                '}';
    }
}
