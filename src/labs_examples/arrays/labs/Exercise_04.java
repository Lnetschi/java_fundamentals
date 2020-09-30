package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] irregArray = new int[][]{
                {123, 45, 678},
                {987, 65, 43, 21},
        };

        for (int[] nums : irregArray) {
            for (int val : nums) {
                System.out.print(" : " + val);
            }
            System.out.println();
        }

    }
}