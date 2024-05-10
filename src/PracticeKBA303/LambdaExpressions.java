package PracticeKBA303;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExpressions {
    public static void main(String[] args) {
    String[] name = { "Peter","John", "James","Simon","Bartholomew","Andrew","Jude","Matthew"};
    Integer[] numbers ={1,2,3,5,6,7,8,9,10};

    ArrayList<String> nameList = new ArrayList<>(Arrays.asList(name));
    ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));

    //Use the three different types of lambda expressions with a forEach() or removeIf method
    nameList.forEach(n -> System.out.println(n.toLowerCase()));
    System.out.println("Before: " + Arrays.toString(numList.toArray()));
    numList.removeIf((n) -> n % 2 == 0);
    System.out.println("After: " + Arrays.toString(numList.toArray()));
    nameList.forEach((n) -> {
        if(n.length() > 5) {
            System.out.println(n.toLowerCase());
        } else {
            String first = n.substring(0, 1);
            String second = n.substring(1, n.length() -1).toLowerCase();
            String third = n.substring(n.length() -1).toUpperCase();
            n = first + second + third;
            System.out.println(n);
        }
    });
    }
}
