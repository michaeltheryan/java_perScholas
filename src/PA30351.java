import java.util.Scanner;

public class PA30351 {
    public static void main(String[] args) {
        multiTable(12);

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter two positive integers\nInteger 1? ");
        int num1 = input.nextInt();
        System.out.println("Integer 2? ");
        int num2 = input.nextInt();

        int result = greatestCommonDenominator(num1, num2);

        if (result > 0) {
            System.out.println("The greatest common denominator (GCD) is " + result + "!");
        } else {
            System.out.println("Greatest common denominator does not exist!");
        }

        System.out.println("\nPlease enter the current tuition: ");
        double tuition = input.nextDouble();
        System.out.println("\nPlease enter the yearly tuition increase as a decimal: ");
        double rate = input.nextDouble();

        tuitionDoubledYears(tuition, rate);

        input.close();
    }

    public static void multiTable(int size) {
        // using the width of the largest sum to determine column width
        int width = 2 + Integer.valueOf((size * size)).toString().length();
        // outer loop for the rows
        for (int i = 1; i <= size; i++) {
            // inner loop for the columns
            for (int j = 1; j <= size; j++) {
                System.out.printf("%" + width + "d", i * j);
            }
            System.out.print("\n");
        }
    }

    public static int greatestCommonDenominator(int num1, int num2) {
        int startNum = num1 > num2 ? num2 : num1;
        for (int i = startNum; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void tuitionDoubledYears(double tuition, double yearlyIncrease) {
        double runningTuition = tuition;
        int i = 0;
        for (; runningTuition < tuition * 2; i++) {
            runningTuition += yearlyIncrease * tuition;
        }
        System.out.println("Tuition will double in " + i + " years.");
    }
}
