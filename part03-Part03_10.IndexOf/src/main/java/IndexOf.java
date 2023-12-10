
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int i;

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int a = scanner.nextInt();

        for (i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (n == a) {
                System.out.println(" " + a + "is at " +(i));
             
                
            }
        }
        
        
     
    }

}

//When the number is found, the output should tell all the indices at which the number was found.
//When the input was:
//51
//22
//-11
//-140
//-18
//-1
//22
//
//Output was:
//
//Search for?
// 22is at 2