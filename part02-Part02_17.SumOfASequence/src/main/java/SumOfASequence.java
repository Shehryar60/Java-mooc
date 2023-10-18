
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Last number?");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            sum = sum + i;

        }
        System.out.println(sum);

    }
}
