package labs_examples.objects_classes_methods.labs.objects;

public class AssociateLab2 {

    public static void main(String[] args) {

        Person j = new Person("Julia");
        Costume x = new Costume("Witch");
        System.out.println(j.name + " will be a " + x.costume + " for Halloween!");
    }
}

    class Person {
        String name;
        public Person(String name) {
            this.name = name;
    }
}

    class Costume {
        String costume;
        public Costume(String costume) {
            this.costume = costume;
    }
}


