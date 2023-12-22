
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
while (true) {
            String s = scanner.nextLine();
            
            if (s.equals("")) {
                break;
            }
            String[] p = s.split(",");
            
            if(max<Integer.valueOf(p[1])){
                max=Integer.valueOf(p[1]);
            }

    }
        System.out.println(max);
}
}
