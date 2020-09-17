package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

        Scanner day = new Scanner(System.in);
        System.out.println("Choose a number 1 - 7 to pick a day of the week:");
        int i = day.nextInt();

        if(i < 1 || i > 7) {
            System.out.println("invalid number please try again");
            return;
        }

        if(i > 1) {
            if(i > 2) {
                if(i > 3) {
                    if(i > 4) {
                        if(i > 5) {
                            if(i > 6) {
                                if(i == 7) {
                                    System.out.println("sunday");
                                }
                            } else {
                                System.out.println("saturday");
                            }
                        } else {
                            System.out.println("friday");
                        }
                    } else {
                        System.out.println("thursday");
                    }
                } else {
                    System.out.println("wednesday");
                }
            } else {
                System.out.println("tuesday");
            }
        }else {
            System.out.println("monday");
        }

        if (i == 1) {
            System.out.println("Monday");
        } else if (i == 2) {
            System.out.println("Tuesday");
        } else if (i == 3) {
            System.out.println("Wednesday");
        } else if (i == 4) {
            System.out.println("Thursday");
        } else if (i == 5) {
            System.out.println("Friday");
        } else if (i == 6) {
            System.out.println("Saturday");
        } else if (i == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Not a number 1 - 7");
        }
    }
}
