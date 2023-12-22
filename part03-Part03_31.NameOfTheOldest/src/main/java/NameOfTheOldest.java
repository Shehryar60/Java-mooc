
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String x = "o";
        while (true) {
            String s = scanner.nextLine();

            if (s.equals("")) {
                break;
            }
            String[] p = s.split(",");

            if (max < Integer.valueOf(p[1])) {
                max = Integer.valueOf(p[1]);
                x = String.valueOf(p[0]);
            }

        }
        System.out.println("Name of the oldest: " + x);

    }
}
