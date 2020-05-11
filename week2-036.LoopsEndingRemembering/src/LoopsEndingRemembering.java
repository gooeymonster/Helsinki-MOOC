import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Type numbers: ");

        int sum = 0;

        int amount = 0;

        double average = 0;

        int amountOfEven = 0;

        int amountOfOdd = 0;

        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if(input == -1){
                System.out.println("Thank you and see you later!");
                break;
            }
            else{
                sum+=input;
                amount++;
                average = (double)sum/amount;
                if(input % 2 == 0){
                    amountOfEven++;
                }
                else{
                    amountOfOdd++;
                }
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + amount);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + amountOfEven);
        System.out.println("Odd numbers: " + amountOfOdd);
    }
}
