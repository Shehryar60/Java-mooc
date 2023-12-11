import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOfSmallest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
 
            list.add(number);
 
        }
        int smallest = list.get(0);
 
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("The smallest number:" + smallest);
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (n == smallest) {
                System.out.println("Found at index: " + i);
 
            }
        }
 
    }
}