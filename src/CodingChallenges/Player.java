package CodingChallenges;

public class Player {
    String firstName;
    String lastName;
    String position;
    int age;
    double height;
    int weight;
    int experience;
    String college;
    int salary;
    String team;

    public Player(String firstName, String lastName, String position, int age, double height, int weight, int experience, String college, int salary, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.experience = experience;
        this.college = college;
        this.salary = salary;
        this.team = team;
    }

    public Player() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", experience=" + experience +
                ", college='" + college + '\'' +
                ", salary=" + salary +
                ", team='" + team + '\'' +
                '}';
    }

    public String firstAndLast(){
        return firstName + " " + lastName;
    }
    public String firstLastAndPosition(){
        return firstAndLast()+" "+position;
    }
    public String firstLastAndSalary(){
        return firstAndLast()+" "+salary;
    }

    public String firstLastAndTeam(){
        return firstAndLast()+" "+team;
    }

    public int convertPlayerHeightToCm(int height){
        return (int) (height * 2.54);
    }
    public int convertPlayerWeightToKg(int weight){
        return (int) (weight * 0.45359237);
    }
}
