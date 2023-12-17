
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String s = scanner.nextLine();
        boolean as = s.equals("true");

        if (as) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
}
