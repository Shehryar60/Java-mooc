
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();

        while (true) {

            // implement here a program, that first reads user input
            int a = scanner.nextInt();

            if (a == -1) {

                break;
                // adding them on a list until user gives -1.
            }
            number.add(a);
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;

        for (int n : number) {
            sum = sum + n;

        }
        System.out.println("sum is " + sum);
    }
}
