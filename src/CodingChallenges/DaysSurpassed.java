package CodingChallenges;

import java.util.Scanner;

public class DaysSurpassed {
    // Print number of days until given days parameter surpasses weeks parameter
    // Print the new total for days and weeks
    public static void main(String[] args) {
        userPrompt();
    }

    public static void userPrompt() {
        System.out.println("Enter the number of days: ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        while(days<0) {
            System.out.println("Please enter a positive number!");
            System.out.println("Enter the number of days: ");
            days = sc.nextInt();
        }

        System.out.println("Enter the number of weeks: ");
        int weeks = sc.nextInt();
        while(weeks<0) {
            System.out.println("Please enter a positive number!");
            System.out.println("Enter the number of weeks: ");
            days = sc.nextInt();
        }

        calcDaysWeeks(days, weeks);
    }

    public static void calcDaysWeeks(int days, int weeks) {
        int dayCount = 0;
        while(days <= weeks) {
            dayCount++;
            if(days%7 == 0) {weeks++;}
            days++;
        }
        System.out.println("It will take " + dayCount + " days to surpass the weeks count.");
        System.out.println("New week count is " + weeks + ".");
    }
}
