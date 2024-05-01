package CodingChallenges;

import static CodingChallenges.Addition.additionPrint;
import static CodingChallenges.Multiplication.multiplyPrint;
import static PracticeSBA.Division.divisionPrint;
import static PracticeSBA.Subtraction.subtractionPrint;

public class StringArithmetic {
    public static void main(String[] args) {
        String test = "3746373837463738";
        splitString(test);
    }

    public static void splitString(String s) {
        String firstQuarter = s.substring(0, s.length() / 4);
        subtractQuarter(firstQuarter);
        String secondQuarter = s.substring(s.length() / 4, s.length() / 2);
        divideQuarter(secondQuarter);
        String thirdQuarter = s.substring(s.length() / 2, s.length() * 3 / 4);
        multiplyQuarter(thirdQuarter);
        String fourthQuarter = s.substring(s.length() * 3 / 4);
        addQuarter(fourthQuarter);
    }
    public static void subtractQuarter(String quarters) {
        subtractionPrint(quarters);
    }
    public static void divideQuarter(String quarters) {
        divisionPrint(quarters);
    }
    public static void multiplyQuarter(String quarters) {
        multiplyPrint(quarters);
    }
    public static void addQuarter(String quarters) {
        additionPrint(quarters);
    }
}
