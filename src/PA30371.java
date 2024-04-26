import java.util.Arrays;
import java.util.Scanner;

public class PA30371 {
    public static void main(String[] args) {
        // Task 1
        // declare and initialize array
        int[] arrayTaskOne = new int[3];

        // assign values to array
        arrayTaskOne[0] = 1;
        arrayTaskOne[1] = 2;
        arrayTaskOne[2] = 3;

        // display array contents
        System.out.println("Task 1 Output:");
        // loop through array to display each element
        for (int i = 0; i < arrayTaskOne.length; i++) {
            System.out.println(arrayTaskOne[i]);
        }

        // Task 2
        System.out.println("\nTask 2 Output:");
        // Call method to return value at middle index
        System.out.println("Middle value is: " + returnMiddle(new int[]{13, 5, 7, 68, 2}));

        // Task 3
        System.out.println("\nTask 3 Output:");
        // Declare and initialize string array
        String[] stringArray = new String[] {"red", "green", "blue", "yellow"};
        System.out.println("Array length: " + stringArray.length);
        String[] stringArrayCopy = stringArray.clone();
        System.out.println("stringArray and clone are equal? " +
                Arrays.toString(stringArray).equals(Arrays.toString(stringArrayCopy)));

        // Task 4
        System.out.println("\nTask 4 Output:");
        // Declare and initialize array
        int[] numberArray = new int[] {1, 2, 3, 4, 5};
        // Display value at first index
        System.out.println("Value at first index: " + numberArray[0]);
        System.out.println("Value at last index: " + numberArray[numberArray.length - 1]);

        // Task 5
        System.out.println("\nTask 5 Output:");
        // Declare array
        int[] emptyNumberArray = new int[5];
        // Loop through array and assign indexes as values
        for (int i = 0; i < emptyNumberArray.length; i++) {
            emptyNumberArray[i] = i;
        }
        // Display new array
        System.out.println("Task 5 Array: " + Arrays.toString(emptyNumberArray));

        // Task 6
        System.out.println("\nTask 6 Output:");
        // Declare and initialize array
        int[] integerArray = new int[] {1, 2, 3, 4, 5};
        // Loop assign value of loop control times 2 to each index
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = i * 2;
        }
        // Display new array
        System.out.println("Task 6 Array: " + Arrays.toString(integerArray));

        // Task 7
        System.out.println("\nTask 7 Output:");
        // Declare and initialize string array
        String[] arrayOfStrings = new String[] {"red", "green", "blue", "purple", "yellow"};
        // Display each element in array except middle
        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (i == arrayOfStrings.length / 2) {
                continue;
            }
            System.out.println("Value at array index: " + i + " is " + arrayOfStrings[i]);
        }

        // Task 8
        System.out.println("\nTask 8 Output:");
        // Declare and initialize string array
        String[] arrayOfColors = new String[] {"red", "green", "blue", "purple", "yellow"};
        // Display new array
        System.out.println("Task 8 Original Array: " + Arrays.toString(arrayOfColors));
        // Assign value of first index to new variable
        String source = arrayOfColors[0];
        // Copy value of middle index to first index
        arrayOfColors[0] = arrayOfColors[2];
        // Assign original value of first index to middle index
        arrayOfColors[2] = source;
        // Display changed array
        System.out.println("Task 8 Changed Array: " + Arrays.toString(arrayOfColors));

        // Task 9
        System.out.println("\nTask 9 Output:");
        // Declare and initialize array
        int[] arrayOfIntegers = new int[] {4, 2, 9, 13, 1, 0};
        // Display new array
        System.out.println("Original array: " + Arrays.toString(arrayOfIntegers));
        // Sort array
        Arrays.sort(arrayOfIntegers);
        // Convert array to string for display
        String arrayString = Arrays.toString(arrayOfIntegers);
        // Display sorted array
        System.out.println("Array in ascending order: " + arrayString.substring(1, arrayString.length() - 1));
        // Display smallest element
        System.out.println("The smallest number is " + arrayOfIntegers[0]);
        // Display largest element
        System.out.println("The biggest number is " + arrayOfIntegers[arrayOfIntegers.length - 1]);

        // Task 10
        System.out.println("\nTask 10 Output:");
        // Declare and initialize array
        Object[] arrayObject = new Object[] {1, "red", "green", "blue", 3.5};
        // Display new array
        System.out.println("Object array: " + Arrays.toString(arrayObject));

        // Task 11
        System.out.println("\nTask 11 Output:");
        // Create scanner for input
        Scanner input = new Scanner(System.in);
        // Prompt for user input
        System.out.println("How many favorite things do you have?");
        // Assign user input to variable
        int numberOfThings = Integer.valueOf(input.nextLine());
        // Create array to contain user inputs
        String[] favoriteThings = new String[numberOfThings];
        // Initialize while loop counter
        int i = 0;
        // Prompt for given number of user inputs
        while (i < numberOfThings) {
            System.out.println("Enter your thing: ");
            favoriteThings[i] = input.nextLine();
            i++;
        }
        System.out.println("Your favorite things are:");
        for (int j = 0; j < favoriteThings.length; j++) {
            System.out.print(favoriteThings[j] + " ");
        }
        System.out.print("\n");
    }

    // method accepts array and returns middle element
    public static int returnMiddle(int[] arr) {
        return arr[arr.length / 2];
    }
}