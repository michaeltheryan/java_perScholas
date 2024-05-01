package CodingChallenges;

public class Multiplication {
    public static void main(String[] args) {
        String s = "824";
        multiplyPrint(s);
    }

    public static void multiplyPrint(String str) {
        String[] stringSplit = str.split("");
        int product = Integer.parseInt(stringSplit[0]);
        StringBuilder outcomeFirst = new StringBuilder("Summary: " + stringSplit[0] + " * ");
        StringBuilder outcomeSecond = new StringBuilder();
        for (int i = 1; i < stringSplit.length; i++) {
            outcomeFirst.append(stringSplit[i]);
            outcomeSecond.append(product);
            outcomeSecond.append(" * ");
            outcomeSecond.append(Integer.parseInt(stringSplit[i]));
            outcomeSecond.append(" = ");
            product *= Integer.parseInt(stringSplit[i]);
            outcomeSecond.append(product);
            outcomeSecond.append("\n");
            outcomeFirst.append(" * ");
        }
        outcomeFirst.replace(outcomeFirst.length() - 3, outcomeFirst.length() -1, " =");
        outcomeFirst.append(product);
        System.out.println(outcomeFirst);
        System.out.println(outcomeSecond);
        System.out.println("Answer = " + product + "\n");
    }
}
