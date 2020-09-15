package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // please declare an int variable below, and set it to the value of the length of "str"

        String str1 = "hello string 1 ";
        String str2 = "hello string 2 ";

        System.out.println("String length is " + str1.length());


        // please initialize a boolean variable and test whether str1 is equal to str2
        boolean equalStrings = str1.equalsIgnoreCase(str2);
        System.out.println("Do strings 1 and 2 match? " + equalStrings);



        // please concatenate str & str2 and set the result to a new String variable below
        String result = str1 + str2;
        System.out.println(result);


        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println(str1.contains ("ring"));
        System.out.println(str2.contains ("blue"));
    }


}