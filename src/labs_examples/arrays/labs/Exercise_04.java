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

        for (int i = 0; i < irregArray.length; i++) {
            for (int x = 0; x < irregArray[i].length; x++) {

            }
        }

        for (int[] value : irregArray) {
            for (int val : value) {
                System.out.print(" : " + val);
            }
            System.out.println();
        }

    }
}