
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if (n > 0) {
                sum = sum + n;
                a++;

            } else if (n < 0) {
                sum = sum + n;
                a++;

            } else if (n == 0) {
                break;
            }

        }
        System.out.println("Number of numbers: " + a);
        System.out.println("Sum of the numbers: " + sum);

    }
}
