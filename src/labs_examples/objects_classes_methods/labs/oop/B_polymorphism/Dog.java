package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Penguin extends Animal{

    private int diveDepth;

    public Penguin(String eat) {
        super(eat);
    }
    public Penguin(int diveDepth){
        super(diveDepth);
        System.out.println("16");
    }

    public Penguin(String eat, int diveDepth) {
        super.setEat("krill");
        this.diveDepth = diveDepth;
    }

    public int getDiveDepth() {
        return diveDepth;
    }

    public void setDiveDepth(int diveDepth) {
        this.diveDepth = diveDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "diveDepth=" + diveDepth +
                '}';
    }
}
