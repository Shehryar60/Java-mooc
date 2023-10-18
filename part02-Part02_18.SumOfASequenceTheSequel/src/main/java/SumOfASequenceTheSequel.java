
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number? ");
        int a = scanner.nextInt();
        System.out.println("Last number?");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
