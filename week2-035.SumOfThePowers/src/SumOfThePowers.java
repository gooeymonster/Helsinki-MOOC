
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int exponent = Integer.parseInt(reader.nextLine());

        int number = 2;

        int sum = 0;

        int n = 0;

        while(n <= exponent){
            sum += (int)Math.pow(number, n);
            n++;
        }

        System.out.println("The result is " + sum);
    }
}
