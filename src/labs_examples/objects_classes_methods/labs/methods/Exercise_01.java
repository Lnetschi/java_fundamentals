package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int a =20;
        int b = 5;
        int count = varargs("one", "two", "three", "four", "five");
        int x = yearsToSeconds(7);
        int result = multiply(a, b);
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        tellJoke();
        System.out.println(count);
        System.out.println(x);

    }

     // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
            return a * b;
        }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
            return a / b;
        }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void tellJoke() {
        System.out.println("What does a wolf say when he stubs his toe? oooowwwwwwww");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    private static int yearsToSeconds(int years) {

        int secondsInMinute = 60;
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;
        int secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;
        return secondsInYear * years;
    }



    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargs(String... args){
        int count = 0;
        for(String ignored : args){
            count++;
        }
        return count;
    }
}
