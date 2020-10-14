package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Animal {

   private String type;

    public Animal(){

    }

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void move(){
        System.out.println("animal walking");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                '}';
    }
}
