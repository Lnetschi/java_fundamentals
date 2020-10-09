package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethdodTraining {
    public static void main(String[] args) {


        int total = add(2, 3);
        int total2 = add(4, 5, 6);
        int bigNum = largestNum(14,12,16,17);
        int numConsonants = consonants("java is hard");
        boolean isPrime = prime(29);
        int[] bigSmall = bigSmall();
        int[] swap = swapArray();
        int i = 4;
        passByValue(i);
        System.out.println(i);
        passByReference();
        divisibleBy(10,2,5);


        System.out.println(add(2, 3));
        System.out.println(add(4, 5, 6));
        System.out.println(consonants("java is hard"));
        System.out.println(Arrays.toString(swap));
        System.out.println(isPrime);
        System.out.println(bigNum);
        System.out.println(divisibleBy(10,2,5).size());

        art();
    }

    //method overloading
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // pass by value
    public static void passByValue(int j){
       int i  = j * 10;
    }

    //pass by reference
    public static void passByReference(){

        Car c = new Car();
        c.color = "red";
        System.out.println(c.color + " before change");
        updatePassRef(c);
        System.out.println(c.color + " after change");
    }

    public static void updatePassRef(Car c){
        c.color = "blue";
    }


    //largest of 4 numbers
    private static int largestNum(int a, int b, int c, int d) {
        int largest = a;
        if(b > largest)
            largest = b;
        if (c > largest)
            largest = c;
        if (d > largest)
            largest = d;
        return largest;
    }

    //consonants
    public static int consonants(String str) {

        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(vowels.indexOf(ch) >= 0) {
                continue;
            } else if (ch >= 'a' && ch <= 'z'){
                count++;
            }
        }
        return count;
    }

    //art
    public static void art() {

        System.out.println(" /\\_/\\");
        System.out.println("( o.o )");
        System.out.println(" > ^ <");
    }

    //prime number
    private static boolean prime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    //array largest and smallest
    private static int[] bigSmall() {

        int numbers[] = new int [] {4,5,7,2,6};
        int smallest = numbers[0];
        int largest = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        System.out.println("largest " + largest);
        System.out.println("smallest " + smallest);
        return numbers;
    }

    //ArrayList
    public static ArrayList<Integer> divisibleBy(int maxNum, int divisor1, int divisor2){

        ArrayList<Integer> numsArray = new ArrayList<>();

        for(int i = 0; i <= maxNum; i++) {
            if(i % divisor1 == 0 && i % divisor2 == 0){
                numsArray.add(i);
            }
        }
        return numsArray;
    }

    //swap array in place
    private static int[] swapArray() {
        int[] nums = {41,25,36};
        int temp;

        for(int i =0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length -1 - i] = temp;
        }
        return nums;
    }
}

class Car {
    String color;
}







