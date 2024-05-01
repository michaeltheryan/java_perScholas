package CodingChallenges;

public class Addition {
    public static void main(String[] args) {
        String s = "824";
        additionPrint(s);
    }

    public static void additionPrint(String str) {
        String[] stringSplit = str.split("");
        int sum = Integer.parseInt(stringSplit[0]);
        StringBuilder outcomeFirst = new StringBuilder("Summary: " + stringSplit[0] + " + ");
        StringBuilder outcomeSecond = new StringBuilder();
        for (int i = 1; i < stringSplit.length; i++) {
            outcomeFirst.append(stringSplit[i]);
            outcomeSecond.append(sum);
            outcomeSecond.append(" + ");
            outcomeSecond.append(Integer.parseInt(stringSplit[i]));
            outcomeSecond.append(" = ");
            sum += Integer.parseInt(stringSplit[i]);
            outcomeSecond.append(sum);
            outcomeSecond.append("\n");
            outcomeFirst.append(" + ");
        }
        outcomeFirst.replace(outcomeFirst.length() - 3, outcomeFirst.length() -1, " =");
        outcomeFirst.append(sum);
        System.out.println(outcomeFirst);
        System.out.println(outcomeSecond);
        System.out.println("Answer = " + sum + "\n");
    }
}
