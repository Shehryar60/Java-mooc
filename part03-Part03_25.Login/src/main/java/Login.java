
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String s = scanner.nextLine();
        System.out.println("Enter password:");
        String p = scanner.nextLine();
        if (s.equals("alex") && p.equals("sunshine") || s.equals("emma") && p.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
