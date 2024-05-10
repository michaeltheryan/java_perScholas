package InClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Integer[] numbers;

    public static void main(String[] args) {
        List<Integer> list = input();
        int operation = list.removeLast();
        numbers = list.toArray(new Integer[0]);
        MainEntry calc = new MainEntry();
        System.out.print("Result: ");
        switch(operation) {
            case 1 -> System.out.println(calc.addTwoVar.compute(numbers));
            case 2 -> System.out.println(calc.subtractTwoVar.compute(numbers));
            case 3 -> System.out.println(calc.multiplyTwoVar.compute(numbers));
            case 4 -> System.out.println(calc.divideTwoVar.compute(numbers));
        }
    }

    public static List<Integer> input() {
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Please input first number for calculation:");
        System.out.println("(input 00 to stop)");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("00")) {
            input = scanner.nextLine();
            numbers.add(Integer.parseInt(input));
            System.out.println("Please input next number:");
        }

        System.out.println("Which calculation would you like to perform?");
        System.out.println("Input:");
        System.out.println("1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n");
        int choice = scanner.nextInt();
        numbers.add(choice);
        scanner.close();

        return numbers;
    }
}
