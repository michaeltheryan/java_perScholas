package PracticeSBA;

public class Division {
    public static void main(String[] args) {
        String s = "824";
        divisionPrint(s);
    }

    public static void divisionPrint(String str) {
        String[] stringSplit = str.split("");
        int quotient = Integer.parseInt(stringSplit[0]);
        StringBuilder outcomeFirst = new StringBuilder(stringSplit[0] + " ÷ ");
        StringBuilder outcomeSecond = new StringBuilder();
        for (int i = 1; i < stringSplit.length; i++) {
            outcomeFirst.append(stringSplit[i]);
            outcomeSecond.append(quotient);
            outcomeSecond.append(" ÷ ");
            outcomeSecond.append(Integer.parseInt(stringSplit[i]));
            outcomeSecond.append(" = ");
            quotient /= Integer.parseInt(stringSplit[i]);
            outcomeSecond.append(quotient);
            outcomeSecond.append("\n");
            outcomeFirst.append(" ÷ ");
        }
        outcomeFirst.replace(outcomeFirst.length() - 3, outcomeFirst.length() -1, " =");
        outcomeFirst.append(quotient);
        System.out.println(outcomeFirst);
        System.out.println(outcomeSecond);
        System.out.println("Answer = " + quotient);
    }
}
