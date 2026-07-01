import java.util.*;

public class GreaterThanAverage {

    public static void main(String[] args){

        List<Integer> nums=
            List.of(10,20,30,40,50);

        double avg=
            nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        nums.stream()
            .filter(n->n>avg)
            .forEach(System.out::println);
    }
}
