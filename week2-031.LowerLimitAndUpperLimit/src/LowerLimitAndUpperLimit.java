
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int lowerLimit = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        int upperLimit = Integer.parseInt(reader.nextLine());

        int number = lowerLimit;


        while(number <= upperLimit){
            if(lowerLimit>upperLimit){
                break;
            }

            System.out.println(number);
            number++;

        }

    }
}
