
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;

        while (true) {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if (n > 0) {
                sum = sum + n;

            } else if (n < 0) {
                sum = sum + n;

            } else if (n == 0) {
                break;
            }

        }
        System.out.println("Sum of the numbers: " + sum);

    }
}
