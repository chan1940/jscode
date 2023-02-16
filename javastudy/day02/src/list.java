import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(9);
        numbers.add(4);
        System.out.println(numbers.get(1));
        numbers.remove(1);
        System.out.println(numbers.get(1));

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
//        for(int i = 0; i<numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }
        System.out.println(numbers.contains(Integer.valueOf(5)));



    }
}
