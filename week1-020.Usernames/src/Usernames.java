
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String username1 = "alex";
        String password1 = "mightyducks";

        String username2 = "emily";
        String password2 = "cat";

        System.out.print("Type your username: ");
        String enterUser = reader.nextLine();

        System.out.print("Type your password: ");
        String enterPass = reader.nextLine();

        if (enterUser.equals(username1) && enterPass.equals(password1)) {
            System.out.println("You are now logged into the system!");
        }
        else if (enterUser.equals(username2) && enterPass.equals(password2)){
            System.out.println("You are now logged into the system!");
        }
        else{
            System.out.println("Your username or password was invalid!");
        }

    }
}
