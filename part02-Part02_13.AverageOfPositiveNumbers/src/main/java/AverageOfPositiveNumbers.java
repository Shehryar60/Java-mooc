
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0, a = 0, sum = 0;
        int n;
        while (true) {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if (n > 0) {
                a++;
                sum = sum + n;
                continue;

            }
            if (n == 0) {

                break;

            }

        }
        if (a == 0) {
            System.out.println("Cannot calculate the average");

        } else {
            avg = sum / a;
            System.out.println(avg);
        }
    }
}
