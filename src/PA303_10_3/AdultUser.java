package PA303_10_3;

public class AdultUser implements LibraryUser {

    private int age;
    private String bookType;

    @Override
    public void registerAccount(int age) {
        if (age >= 11) {
            this.age = age;
            System.out.println("You have successfully registered under an Adult Account.");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    public void requestBook(String bookType) {
        if (bookType.equals("Fiction")) {
            this.bookType = bookType;
            System.out.println("Book issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}
