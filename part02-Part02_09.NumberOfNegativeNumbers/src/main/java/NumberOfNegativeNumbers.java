
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, n;

        while (true) {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if (n > 0) {
                continue;

            } else if (n < 0) {
                a++;

            } else if (n == 0) {
                break;
            }

        }
        System.out.println("Number of negative numbers: " + a);

    }
}
