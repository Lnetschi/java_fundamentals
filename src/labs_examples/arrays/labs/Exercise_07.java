package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<String> groceries  = new ArrayList<>();

            groceries.add("Cookies");
            groceries.add("Milk");
            groceries.add("Turkey");
            groceries.add("Cheese");
            groceries.add("Chips");

        String shop = groceries.get(3);
        System.out.println("Cheese is at the index of " + 3);

        boolean check = groceries.contains("Milk");
        System.out.println("Groceries contains milk: " + check);

        System.out.println("The array looks like this  ------ " + groceries);

        for (String list : groceries) {
            System.out.println( "ArrayList of grocery items one by one: " + list);
        }
    }
}
