package PA303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser tike = new KidUser();

        tike.registerAccount(10);
        tike.registerAccount(18);

        tike.requestBook("Kids");
        tike.requestBook("Fiction");

        AdultUser grown = new AdultUser();

        grown.registerAccount(5);
        grown.registerAccount(23);

        grown.requestBook("Kids");
        grown.requestBook("Fiction");
    }
}
