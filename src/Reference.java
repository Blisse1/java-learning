import java.util.ArrayList;
import java.util.List;

public class Reference {
    public static void main(String[] args) {
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i + " < " + j);
        }
        // Enhanced for loop
        int[] arrayofInts = new int[]{1, 2, 3, 4, 5};
        for(int i: arrayofInts){
            System.out.println(i);
        }

        // Dynamic array
        List<String> list = new ArrayList<String>();
        list.add("foo");
        list.add("bar");

        for(String s : list)
            System.out.println(s);
    }
}
