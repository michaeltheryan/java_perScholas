package CodingChallenges;

import java.util.Arrays;

public class RandomizeList {

    private static final String[] NAMES =
            {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};

    public static void main(String[] args) {
        // Create a program that can randomize a list of names
        // Return the list of string in a random order
        System.out.println(Arrays.toString(randomize(NAMES)));
    }

    public static String[] randomize(String[] names) {
        String[] newNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            int nextRandomIndex = (int)(Math.random() * names.length);
            while (newNames[nextRandomIndex] != null) {
                nextRandomIndex = (int)(Math.random() * names.length);
            }
            newNames[nextRandomIndex] = names[i];
        }
        return newNames;
    }
}
