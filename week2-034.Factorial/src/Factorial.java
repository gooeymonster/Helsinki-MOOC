import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int factorial = Integer.parseInt(reader.nextLine());

        int number = 1;
        int product = 1;

        while(number <= factorial){
            product *= number;
            number++;

        }
        System.out.println("Factorial is " + product);

    }
}
