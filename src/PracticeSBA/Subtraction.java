package PracticeSBA;

public class Subtraction {
    public static void main(String[] args) {
        String s = "824";
        subtractionPrint(s);
    }

    public static void subtractionPrint(String str) {
        String[] stringSplit = str.split("");
        int difference = Integer.parseInt(stringSplit[0]);
        StringBuilder outcomeFirst = new StringBuilder(stringSplit[0] + " - ");
        StringBuilder outcomeSecond = new StringBuilder();
        for (int i = 1; i < stringSplit.length; i++) {
            outcomeFirst.append(stringSplit[i]);
            outcomeSecond.append(difference);
            outcomeSecond.append(" - ");
            outcomeSecond.append(Integer.parseInt(stringSplit[i]));
            outcomeSecond.append(" = ");
            difference -= Integer.parseInt(stringSplit[i]);
            outcomeSecond.append(difference);
            outcomeSecond.append("\n");
            outcomeFirst.append(" - ");
        }
        outcomeFirst.replace(outcomeFirst.length() - 3, outcomeFirst.length() -1, " =");
        outcomeFirst.append(difference);
        System.out.println(outcomeFirst);
        System.out.println(outcomeSecond);
        System.out.println("Answer = " + difference);
    }
}
