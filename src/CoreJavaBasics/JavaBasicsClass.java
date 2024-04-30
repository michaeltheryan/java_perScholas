package CoreJavaBasics;

public class JavaBasicsClass {
    // Create a class with a main( ) method to run the exercises
    public static void main(String[] args) {
        /*
        Write a program that declares two integer variables,
        assigns an integer to each, and adds them together.
        Assign the sum to a variable. Print out the result.
         */
        int a, b;
        a = 10;
        b = 123;
        int c = a + b;
        System.out.println(c);

        /*
        Write a program that declares two double variables,
        assigns a number to each, and adds them together.
        Assign the sum to a variable. Print out the result.
         */
        double d, e;
        d = (double) a;
        e = 4.5;
        double f = a + b;
        System.out.println(f);

        /*
        Write a program that declares an integer variable and a double variable,
        assigns numbers to each, and adds them together.
        Assign the sum to a variable. Print out the result.
        What variable type must the sum be? DOUBLE
         */
        int g = 9;
        double h = 424.1;
        double i = h + g;
        System.out.println(i);

        /*
        Write a program that declares two integer variables,
        assigns an integer to each, and divides the larger number by the smaller number.
        Assign the result to a variable. Print out the result.
        Now change the larger number to a decimal. What happens? ERROR Message
        What corrections are needed? Cast quotient to a double
         */
        int j = 24;
        int k = 10;
        int l = j / k;
        System.out.println(l);

        int m = 24;
        int n = 10;
        double o = 1.0 * j / k;
        System.out.println(o);

        /*
        Write a program that declares two double variables,
        assigns a number to each, and divides the larger by the smaller number.
        Assign the result to a variable. Print out the result.
        Now, cast the result to an integer. Print out the result again.
         */

        double p, qq;
        p = 3.0;
        qq = 23.4;
        double r = qq / p;
        System.out.println(r);
        int s = (int) r;
        System.out.println(s);

        /*
        Write a program that declares two integer variables, x and y, and
        assigns the number 5 to x and the number 6 to y.
        Declare a variable q and assign y/x to it and print q.
        Now, cast y to a double and assign it to q. Print q again.
         */
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println(q);
        q = (double) y;
        System.out.println(q);

        /*
        Write a program that declares a named constant and uses it in a calculation.
        Print the result.
         */
        final int milesInFeet = 5280;
        int milesFromHomeToOmaha = 1246;
        int distanceToOmaha = milesInFeet * milesFromHomeToOmaha;
        System.out.printf("%,d\n", distanceToOmaha);

        /*
        Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product.
        Create two more variables called subtotal and totalSale and
        complete an “order” for three items of the first product,
        four items of the second product, and two items of the third product.
        Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and
        add sales tax to the subtotal to obtain the totalSale amount.
        Be sure to format the results to two decimal places.
         */
        double coffee = 3.50;
        double beans = 15.25;
        double croissant = 4.75;

        double subtotal = coffee * 3 + beans * 4 + croissant * 2;
        final double SALES_TAX = .08875;
        double total = subtotal + subtotal * SALES_TAX;

        System.out.printf("$%.2f\n", total);
    }
}
