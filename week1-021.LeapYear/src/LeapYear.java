
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int enterYear = Integer.parseInt(reader.nextLine());

        if((enterYear % 4 == 0 && (enterYear % 400 == 0))){
            System.out.println("The year is a leap year.");
        }
        else if((enterYear % 4 == 0 && !(enterYear % 100 == 0))){
            System.out.println("The year is a leap year.");
        }
        else{
            System.out.println("The year is not a leap year.");
        }

    }
}
