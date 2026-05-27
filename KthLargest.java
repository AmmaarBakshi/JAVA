import java.util.*;

public class KthLargest {

    public static void main(String[] args){

        List<Integer> list=
            List.of(7,2,9,1,5,10);

        int k=3;

        int val =
            list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(k-1)
                .findFirst()
                .orElse(-1);

        System.out.println(val);
    }
}
