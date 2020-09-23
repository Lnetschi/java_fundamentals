package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {


        double i = 0;
        double x = 0;
        double sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick first number: ");
        i = scanner.nextDouble();

        System.out.println("Pick second number: ");
        x = scanner.nextDouble();


        for (; i <= x; i++) {
            sum += i;
            count++;
        }
        System.out.println("you numbers equal: " + sum);
        double avg = sum / count;
        System.out.println("average = " + avg);
    }
}