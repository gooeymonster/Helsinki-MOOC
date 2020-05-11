
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int evenNumber = 0;
        while (evenNumber < 101) {

            evenNumber++;
            if (evenNumber % 2 == 0) {
                System.out.println(evenNumber);

            }
        }
    }
}
