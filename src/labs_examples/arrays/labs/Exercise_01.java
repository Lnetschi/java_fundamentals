package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        //System.out.println("Enter 10 numbers: ");
        int[] array = new int[10];
        int sum = 0;
        int i = 0;

        for (; i < array.length; i++) {
            System.out.println("Enter the " + (i + 1) + " number:");
            array[i] = s.nextInt();
            sum += array[i];
        }
        System.out.println("The sum is " + sum);
        double avg = (double) sum / 10;
        System.out.println("Average = " + avg);
    }
}