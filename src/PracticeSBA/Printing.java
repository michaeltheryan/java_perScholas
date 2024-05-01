package PracticeSBA;

public class Printing {
    public static void main(String[] args) {
        String s = "597";
        printViaStringClass(s);
        printViaCharacterClass(s);
    }

    public static void printViaStringClass(String s){
        String[] words = s.split("");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Print : Number " + (i + 1) + " is " + words[i]);
        }
    }

    public static void printViaCharacterClass(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Print : Number " + (i + 1) + " is " + s.charAt(i));
        }
    }
}
