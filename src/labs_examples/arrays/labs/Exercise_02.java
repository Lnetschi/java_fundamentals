package labs_examples.arrays.labs;


import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Pick a number 1 - 10: ");
        int i = scan.nextInt();

        if(i <= 10 && i >= 1) {
            for(int x = 0; x < array.length; x++) {
                if (array[x] == i) {
                    System.out.print("Index of element is "  + x + " : Your number was " + i);
                    break;
                }
            }
        } else {
            System.out.println("invalid number");
        }
    }
}



