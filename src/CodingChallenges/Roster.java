package CodingChallenges;

public class Roster {
    private Player[] league;
    private int lastIndex;

    public Roster() {
        this.league = new Player[20];
        this.lastIndex = 0;
    }

    public void addPlayer(Player player) {
        if (this.lastIndex > .5 * this.league.length) {
            expandLeague();
        }
        this.league[lastIndex] = player;
        lastIndex++;
    }

    public void expandLeague() {
        Player[] newLeague = new Player[this.league.length * 2];
        for (int i = 0; i < this.league.length; i++) {
            newLeague[i] = this.league[i];
        }
        this.league = newLeague;
    }

    public String[] lastNameThatStartWith(String Letter){
        return new String[]{""};
    }


    public int getTotalPlayersFromCollege(String college){

        return 0;
    }

    public int getTotalPlayersWithAge(int age){

        return 0;
    }
    public int getTotalPlayersWithPosition(String position){

        return 0;
    }
    public int getTotalPlayersWithHeight(double height){

        return 0;
    }
    public double getTotalPlayersWithWeight(double weight){

        return 0;
    }
    public int getTotalPlayersWithExperience(int experience){

        return 0;
    }

    public int[] getPlayersFromCollege(String college){

        return new int[]{};
    }

    public int[] getPlayersWithAge(int age){

        return new int[]{};
    }
    public int[] getPlayersWithPosition(String position){

        return new int[]{};
    }
    public double[] getPlayersWithHeight(double height){

        return new double[]{};
    }
    public int[] getPlayersWithWeight(int weight){

        return new int[]{};
    }
    public int[] getPlayersWithExperience(String experience){

        return new int[]{};
    }

    public int[] getPlayersWhoMake(int salary){

        return new int[]{};
    }
    public int[] teamsWithHighestSalary(){

        return  new  int[]{0};
    }
    public int[] teamsWithHighestAverageAge(){

        return  new  int[]{0};
    }

    public int[] teamsWithMinimumAverageAge(){

        return  new  int[]{0};
    }

    public int[] teamsWithMinimumAverageExperience(){

        return  new  int[]{0};
    }
    public int[] teamsWithHighestAverageExperience(){

        return  new  int[]{0};
    }
}
