
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int numberLimit = Integer.parseInt(reader.nextLine());

        int number = 0;
        int sum = 0;

        while(number <= numberLimit){
            sum += number;
            number++;

        }
        System.out.println("Sum is: " + sum);



    }
}
