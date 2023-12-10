
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
            
        }
        
        System.out.println("enter starting number ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        
        System.out.println(numbers.get(a));
        System.out.println(numbers.get(b));
        
    }
}
