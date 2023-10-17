
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0, a = 0, sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if (n > 0) {
                a++;
                sum = sum + n;

            } else if (n < 0) {
                a++;
                sum = sum + n;

            } else if (n == 0) {
                break;
            }

        }
        avg = sum / a;
        System.out.println("Average of the numbers: " + avg);

    }
}
