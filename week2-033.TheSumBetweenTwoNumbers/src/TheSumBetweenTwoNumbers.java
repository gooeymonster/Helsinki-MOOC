
import java.util.Scanner;



public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        int number = firstNumber;
        int sum = 0;

        while(number >= firstNumber && number <= secondNumber) {
            sum += number;
            number++;
        }
        System.out.println("The sum is "+ sum);

    }
}

