package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        int c = 3;
        int d = 4;

        if(c <= d){
            System.out.println("c is less than or equal to d");
        }

        if(d > c){
            System.out.println("d is greater than c");
        }

        if(d >= c){
            System.out.println("d is greater than or equal to c");
        }

        int e = 5;
        int f = 5;

        if(e == f){
            System.out.println("e and f are equal");
        }

    }
}



