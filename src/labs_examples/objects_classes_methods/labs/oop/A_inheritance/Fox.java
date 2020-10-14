package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Fox extends Animal{

    int runSpeed;

    public Fox(int runSpeed) {
        super("fox");
        this.runSpeed = runSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }
    @Override
    public void move(){
        System.out.println("fox running");
    }

    @Override
    public String toString() {
        return super.toString()+ "Fox{" +
                "runSpeed=" + runSpeed +
                '}';
    }
}
