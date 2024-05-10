package InClassTwo;

import java.util.Scanner;

public class MainEntry {
    private String str;

    public void startApplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine().trim();
        GroupSixFunctionalInterface<String, Integer> getStringLength =
                 str -> str.length();
        System.out.println(str + " has length of " + getStringLength.transform(str));
    }
}
