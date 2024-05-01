package CodingChallenges;

public class Combinations {
    public static void main(String[] args) {
        // output the total number of combinations for a password (length 4) that
        // uses only the numbers 1-4
        // You can repeat numbers but not the combination
        // Do not show duplicate combinations
        calcCombos(4, 1, 4);
    }
    private static void calcCombos(int length, int minNumber, int maxNumber) {
        String[] combos = new String[(int) Math.pow((double) (maxNumber - minNumber + 1), (double) length)];
        int combosIndex = 0;
        for (int i = minNumber; i <= maxNumber; i++) {
            for (int j = minNumber; j <= maxNumber; j++) {
                for (int k = minNumber; k <= maxNumber; k++) {
                    for (int m = minNumber; m <= maxNumber; m++) {
                        StringBuilder newCombo = new StringBuilder().append(i).append(j).append(k).append(m);
                        boolean exists = false;
                        for (int n = 0; n < combos.length; n++) {
                            if (newCombo.toString().equals(combos[n])) {
                                exists = true;
                            }
                        }
                        if (!exists) {
                            combos[combosIndex] = newCombo.toString();
                            combosIndex++;
                        }
                    }
                }
            }
        }
        System.out.println(combos.length + " possible combinations");
    }
}
