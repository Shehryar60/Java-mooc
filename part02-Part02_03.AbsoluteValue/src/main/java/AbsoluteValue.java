
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0, n;

        System.out.println("Enter the numebr");
        i = scanner.nextInt();

        if (i > 0) {
            System.out.println(i);
        } else if (i < 0) {
            n = i * (-1);
            System.out.println(n);
        }

    }
}
