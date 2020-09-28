package labs_examples.objects_classes_methods.labs.objects;

public class PetExercise3 {

    public static void main(String[] args) {

        Pet cat = new Pet();
        Pet dog = new Pet("Kennedy", 1);
        Pet fish = new Pet("Princess");

        System.out.println("The cats name is " + cat.name + " and he is " + cat.age + " years old.");
        System.out.println("The dogs name is " + dog.name + " and she is " + dog.age + " years old.");
        System.out.println("The fish is named " + fish.name + ".");
    }
}

class Pet {

    String name;
    int age;

    public Pet() {
        name = "Thomas";
        age = 13;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this.name = name;
    }
}
