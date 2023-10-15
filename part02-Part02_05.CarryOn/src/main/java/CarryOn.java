
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Exit? (y exits)");
            String input = scanner.nextLine();

            if (input.equals("no")) {
                System.out.println("Shall we carry on?");

                break;
            }

            System.out.println("Shall we carry on?");
        }

    }

}
