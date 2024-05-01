package CodingChallenges;

public class Sports {
    public static void main(String[] args) {
        Roster roster = new Roster();
        roster.addPlayer(new Player("Emani", "Barnes", "QB", 27,
                6.5, 237, 7, "Wyoming", 6, "Buffalo Bills"));
        roster.addPlayer(new Player("Damian", "McBride", "QB", 26,
                6, 210, 3, "SMU", 2, "Miami Dolphins"));
        roster.addPlayer(new Player("Kelsey", "Guerra", "QB", 29, 6.3, 222,
                8, "North Carolina", 4, "New England Patriots"));
        roster.addPlayer(new Player("Leland", "Burnett", "RB", 24,
                5.11, 190, 3, "Georgia", 9, "New York Jets"));
        roster.addPlayer(new Player("Emberly", "Hayden", "RB", 24,
                5.1, 216, 3, "Kentucky", 2, "Buffalo Bills"));
        roster.addPlayer(new Player("Leroy", "Perez", "RB", 25, 5.1,
                203, 8, "Appalachian State", 4, "Miami Dolphins"));
        roster.addPlayer(new Player("Eleanor", "Dunn", "RB", 26, 5.1,
                210, 3, "Maryland", 2, "New England Patriots"));
        roster.addPlayer(new Player("Dawson", "O'Connor", "FB", 26,
                6, 244, 5, "Toledo", 8, "New York Jets"));
        roster.addPlayer(new Player("Charli", "Nunez", "WR", 20, 6.4,
                215, 3, "Florida State", 4, "Buffalo Bills"));
        roster.addPlayer(new Player("Caden", "Vazquez", "WR", 24, 5.9,
                178, 8, "Penn State", 7, "Miami Dolphins"));
        roster.addPlayer(new Player("Journee", "McCann", "WR", 30, 6.4,
                221, 3, "North Carolina", 9, "New England Patriots"));
    }


}
