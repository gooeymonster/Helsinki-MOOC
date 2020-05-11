
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            String enterPass = reader.nextLine();
            if (!enterPass.equals(password)) {
                System.out.println("Wrong!");
            }
            if (enterPass.equals(password)) {
                System.out.println("Right!");
                break;
            }
        }
        System.out.println("");
        System.out.println("The secret is: turtles");
    }
}
