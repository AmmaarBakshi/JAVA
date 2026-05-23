import java.util.*;

public class TopN {

    public static void main(String[] args){

        List<Integer> list=
            List.of(7,1,9,2,15,3);

        list.stream()
            .sorted(Comparator.reverseOrder())
            .limit(2)
            .forEach(System.out::println);
    }
}
