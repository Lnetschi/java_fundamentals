package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Runner implements Race {


    @Override
    public void name() {
        System.out.println("joe");
    }

    @Override
    public void mph() {
        System.out.println(5);
    }
}
