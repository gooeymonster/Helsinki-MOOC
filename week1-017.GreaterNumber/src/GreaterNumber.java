import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        int greaterNumber = Math.max(number, number2);

        if(number > number2){
            System.out.println("Greater number: " + greaterNumber);
        }
        else if(number < number2){
            System.out.println("Greater number: " + greaterNumber);
        }
        else{
            System.out.println("The numbers are equal!");
        }


    }
}
