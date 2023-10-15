
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            System.out.println("Give a number:");
            if (n < 0) {

                System.out.println("Unsuitable number");
                continue;

            } else if (n == 0) {
                break;
            } else {
                n = n * n;
                System.out.println(n);
            }
        }
    }
}
