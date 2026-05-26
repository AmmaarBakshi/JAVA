import java.util.*;

public class MedianStream {

    public static void main(String[] args){

        List<Integer> list=
            List.of(7,1,3,9,5);

        List<Integer> sorted =
            list.stream()
                .sorted()
                .toList();

        int median =
            sorted.get(sorted.size()/2);

        System.out.println(median);
    }
}
