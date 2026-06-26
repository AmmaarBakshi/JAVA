import java.util.*;
import java.util.stream.*;

public class DigitGrouping {

    public static void main(String[] args){

        List<Integer> nums=
            List.of(1,22,333,4444,55,666);

        Map<Integer,List<Integer>> map=
            nums.stream()
                .collect(Collectors.groupingBy(
                    n->String.valueOf(n).length()
                ));

        System.out.println(map);
    }
}
