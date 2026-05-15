import java.util.*;

public class SecondHighest {

    public static void main(String[] args){

        List<Integer> list=List.of(5,9,1,12,7);

        int val = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println(val);
    }
}
