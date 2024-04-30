package PA303_2_3;

public class OperatorsAndNumbers {

    public static void main(String[] args) {
        toBinary1();
        toBinary2();
        toBinary3();
        incrementOne();
        incrementTwo();
        incrementThree();
    }

    public static void toBinary1() {
        /*
        Declare an integer variable x,assign the value 2 to it
        Print out the binary string version of the number ( Integer.toBinaryString(x) )
        Use the left shift operator (<<) to shift by 1 and assign the result to x.
        Before printing the results, write a comment with the predicted decimal value and binary string
        Now, print out x in decimal form and in binary notation.
         */
        System.out.println("Binary 1");
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // decimal 4 / binary 100
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        /*
        Perform the preceding exercise with the following values:
        a. 9
        b. 17
        c. 88
        */
        x = 9;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // decimal 18 / binary 10010
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = 17;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // decimal 34 / binary 100010
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = 88;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // decimal 176 / binary 10110000
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }

    public static void toBinary2() {
        /*
        Declares a variable x,and assign 150 to it
        Print out the binary string version of the number
        Use the right shift operator (>>) to shift by 2 and assign the result to x
        Write a comment indicating what you anticipate the decimal and binary values to be
        Now print the value of x and the binary string
         */
        System.out.println("\nBinary 2");
        int x = 150;
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        // 37 / 100101
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }

    public static void toBinary3() {
        /*
        Declare three int variables: x, y,and z and assign 7 to x and 17 to y
        Write a comment that indicates what you predict will be the result of
        the bitwise and operation on x and y.
        Use the bitwise AND (&) operator to derive the decimal and binary values, and
        assign the result to z.
         */
        System.out.println("\nBinary 3");
        int x = 7;
        int y = 17;
        int z;
        // 1 / 1
        z = x & y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
        toBinary4(x, y);
    }

    public static void toBinary4(int x, int y) {
        /*
        With the preceding values, use the bitwise and operator to calculate
        the “or” value between x and y
        Write a comment that indicates what you predict the values to be before printing them out
         */
        // 22 / 10110
        System.out.println("\nBinary 4");
        int z = x ^ y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
    }

    public static void incrementOne() {
        /*
        Declare an integer variable, assigns a number,and
        uses a postfix increment operator to increase the value
        Print the value before and after the increment operator
         */
        System.out.println("\nincrementOne");
        int x = 1;
        System.out.println(x);
        x++;
        System.out.println(x);
    }

    public static void incrementTwo() {
        /*
        Demonstrate at least three ways to increment a variable by 1 multiple times
        Assign a value to an integer variable, print it, increment by 1,
        print it again, increment by 1, and then print it again
         */
        System.out.println("\nincrementTwo");
        int x = 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        ++x;
        System.out.println(x);
    }
    public static void incrementThree() {
        /*
        Declare two integer variables: x, and y, and then assign 5 to x and 8 to y
        Create another variable sum and assign the value of ++x added to y, and
        print the result
        Notice the value of the sum (should be 14)
        Change the increment operator to postfix (x++) and re-run the program
        */
        System.out.println("\nincrementThree");
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println(sum);
        x = 5;
        sum = x++ + y;
        System.out.println(sum);
    }
}
