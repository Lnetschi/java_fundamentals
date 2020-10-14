package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class AnimalController {

    public static void main(String[] args) {

        Bird bird = new Bird(true);
        Bear bear = new Bear(10);
        Dolphin dolphin = new Dolphin(4.5);
        Fox fox = new Fox(40);

        String birdType = bird.getType();
        boolean canFly = bird.isCanFly();

        String bearType = bear.getType();
        int roarIntensity = bear.getRoarIntensity();

        String dolphinType = dolphin.getType();
        double clickVelocity = dolphin.clickVelocity;

        String foxType = fox.getType();
        int runSpeed = fox.runSpeed;

        System.out.println(birdType);
        System.out.println(bearType);
        System.out.println(dolphinType);
        System.out.println(foxType);

        System.out.println(bird.toString());
        System.out.println(bear.toString());
        System.out.println(dolphin.toString());
        System.out.println(fox.toString());
    }
}
