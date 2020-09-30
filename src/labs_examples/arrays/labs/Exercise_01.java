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
        int[] array = new int[10];
        int sum = 0;

        for (int i =0; i < array.length; i++) {
            System.out.println("Enter the " + getNumber(i) + " number:");
            array[i] = s.nextInt();
            sum += array[i];
        }
        System.out.println("The sum is " + sum);
        double avg = (double) sum / 10;
        System.out.println("Average = " + avg);
    }

    public static String getNumber(int i) {
        switch (i) {
            case 0: return "first";
            case 1: return "second";
            case 2: return "third";
            case 3: return "fourth";
            case 4: return "fifth";
            case 5: return "sixth";
            case 6: return "seventh";
            case 7: return "eighth";
            case 8: return "ninth";
            case 9: return "tenth";
            default: return "error";
        }
    }
}