
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> s = new ArrayList<>();
        s.add("First");
        s.add("Second");
        s.add("Third");
        System.out.println(s);
        removeLast(s);

    }

    public static void removeLast(ArrayList<String> strings) {

        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size() - 1);
        System.out.println(strings);

    }
}
