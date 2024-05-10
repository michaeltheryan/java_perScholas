package CodingChallenges;

import java.util.ArrayList;
import java.util.List;

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
        List<String> people = new ArrayList<String>();
        for(Player person : league) {
            if (person.getLastName().substring(0, 1).equals(Letter)) {
                people.add(person.firstAndLast());
            }
        }
        return (String[]) people.toArray();
    }


    public int getTotalPlayersFromCollege(String college){
        List<Player> people = new ArrayList<Player>();
        for(Player person : league) {
            if (person.getCollege().equals(college)) {
                people.add(person);
            }
        }
        return people.size();
    }

    public int getTotalPlayersWithAge(int age){
        List<Player> people = new ArrayList<Player>();
        for(Player person : league) {
            if (person.getAge() == age) {
                people.add(person);
            }
        }
        return people.size();
    }
    public int getTotalPlayersWithPosition(String position){
        List<Player> people = new ArrayList<Player>();
        for(Player person : league) {
            if (person.getPosition().equals(position)) {
                people.add(person);
            }
        }
        return people.size();
    }
    public int getTotalPlayersWithHeight(double height){
        List<Player> people = new ArrayList<Player>();
        for(Player person : league) {
            if (person.getHeight() == height) {
                people.add(person);
            }
        }
        return people.size();
    }
    public double getTotalPlayersWithWeight(double weight){
        List<Player> people = new ArrayList<Player>();
        for(Player person : league) {
            if (person.getWeight() == weight) {
                people.add(person);
            }
        }
        return people.size();
    }
    public int getTotalPlayersWithExperience(int experience){
        List<Player> people = new ArrayList<Player>();
        for(Player person : league) {
            if (person.getExperience() == experience) {
                people.add(person);
            }
        }
        return people.size();
    }

    public int[] getPlayersFromCollege(String college){
        List<Integer> people = new ArrayList<Integer>();
        for(Player person : league) {
            if (person.getCollege().equals(college)) {
                people.add(person.getAge());
            }
        }
        return people.stream().mapToInt(i -> i).toArray();
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
