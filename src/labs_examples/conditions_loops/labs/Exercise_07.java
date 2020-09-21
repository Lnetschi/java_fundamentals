package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Type a word: ");
        String n = s.next();


        String vowel = "aeiou";

        int i = 0;

        while (i < n.length()) {
            char c = n.charAt(i);
            vowel.indexOf(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("First vowel is: " + c);
                break;
            }
                i++;
            }
        System.out.println("Your word is: " + n);
        }

    }




