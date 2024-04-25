import java.util.Scanner;
public class PA30341 {
    public static void main(String[] args) {
        int x;

        System.out.println("Exercise 1 and 2 Output:");
        x = 7;
        System.out.println("For x = 7:\n");
        System.out.println("Exercise 1:");
        ifLessThan(x, 10);
        System.out.println("Exercise 2:");
        ifElseLessThan(x, 10);

        x = 15;
        System.out.println("For x = 15:\n");
        System.out.println("Exercise 1:");
        ifLessThan(x, 10);
        System.out.println("Exercise 2:");
        ifElseLessThan(x, 10);

        System.out.println("Exercise 3 Output:");
        System.out.println("For x = 15:");
        x = 15;
        ifElseIfLessThan(x, 10, 20);

        System.out.println("For x = 50:");
        x = 50;
        ifElseIfLessThan(x, 10, 20);

        System.out.println("Exercise 4 Output:");
        x = 15;
        System.out.println("For x = 15");
        outOfRange(x, 10, 20);

        x = 5;
        System.out.println("For x = 5");
        outOfRange(x, 10, 20);

        Scanner input = new Scanner(System.in);
        System.out.print("Please input one valid test score: ");
        int score = input.nextInt();
        printGrades(score);

        System.out.print("Please select a number from 1-7: ");
        int giorno = input.nextInt();
        printWeekday(giorno);

        System.out.println("Please input your tax filing status:");
        System.out.println("- 1 for Single,");
        System.out.println("- 2 for Married Filing Jointly or");
        System.out.println("  Qualifying Widower,");
        System.out.println("- 3 for Married Filing Separately,");
        System.out.println("- 4 for Head of Household:");

        int status = input.nextInt();

        System.out.print("Please input your income: ");
        double earnings = input.nextDouble();

        taxBill(status, earnings);

        input.close();
    }
    public static void ifLessThan(int testNum, int baseNum) {
        if (testNum < baseNum) {
            System.out.println("Less than " + baseNum + "\n");
        }
    }

    public static void ifElseLessThan(int testNum, int baseNum) {
        if (testNum < baseNum) {
            System.out.println("Less than " + baseNum + "\n");
        } else {
            System.out.println("Greater than " + baseNum + "\n");
        }
    }
    public static void ifElseIfLessThan(int testNum, int baseNum1, int baseNum2) {
        if (testNum < baseNum1) {
            System.out.println("Less than " + baseNum1 + "\n");
        } else if (testNum < baseNum2){
            System.out.println("Between " + baseNum1 + " and " + baseNum2 + "\n");
        } else {
            System.out.println("Greater than or equal to " + baseNum2 + "\n");
        }
    }
    public static void outOfRange(int testNum, int baseNum1, int baseNum2) {
        if (testNum < baseNum1 || testNum > baseNum2) {
            System.out.println("Out of range\n");
        } else {
            System.out.println("In range\n");
        }
    }

    public static void printGrades(int testResult) {
        if (testResult < 0 || testResult > 100) {
          System.out.println("Score out of range");
        } else if (testResult > 89) {
            System.out.println("Test grade is A");
        }  else if (testResult > 79) {
            System.out.println("Test grade is B");
        }  else if (testResult > 69) {
            System.out.println("Test grade is C");
        }  else if (testResult > 59) {
            System.out.println("Test grade is D");
        }  else {
            System.out.println("Test grade is F");
        }
    }

    public static void printWeekday(int number) {
        switch (number) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Out of range");
        }
    }

    public static void taxBill(int status, double income) {
        double owed = 0.0;
        switch(status) {
            case 1:
                if (income > 0 && income < 8351) {
                    owed = .1 * income;
                } else if (income < 33951) {
                    owed = .15 * income;
                } else if (income < 82251) {
                    owed = .25 * income;
                } else if (income < 171551) {
                    owed = .28 * income;
                } else if (income < 372951) {
                    owed = .33 * income;
                } else {
                    owed = .35 * income;
                }
                break;
            case 2:
                if (income > 0 && income < 16701) {
                    owed = .1 * income;
                } else if (income < 67901) {
                    owed = .15 * income;
                } else if (income < 137051) {
                    owed = .25 * income;
                } else if (income < 208851) {
                    owed = .28 * income;
                } else if (income < 372951) {
                    owed = .33 * income;
                } else {
                    owed = .35 * income;
                }
                break;
            case 3:
                if (income > 0 && income < 8351) {
                    owed = .1 * income;
                } else if (income < 33951) {
                    owed = .15 * income;
                } else if (income < 68526) {
                    owed = .25 * income;
                } else if (income < 104426) {
                    owed = .28 * income;
                } else if (income < 186476) {
                    owed = .33 * income;
                } else {
                    owed = .35 * income;
                }
                break;
            case 4:
                if (income > 0 && income < 11951) {
                    owed = .1 * income;
                } else if (income < 45501) {
                    owed = .15 * income;
                } else if (income < 117451) {
                    owed = .25 * income;
                } else if (income < 190201) {
                    owed = .28 * income;
                } else if (income < 372951) {
                    owed = .33 * income;
                } else {
                    owed = .35 * income;
                }
                break;
            default: owed = 0;
        }
        System.out.print("Tax Owed: ");
        System.out.printf("%,.2f%n", owed);
    }
}
