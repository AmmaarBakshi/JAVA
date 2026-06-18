import java.util.*;

public class PrefixSum {

    public static void main(String[] args) {

        Map<String,Integer> map = Map.of(
                "IT_A",10,
                "IT_B",20,
                "HR_A",15,
                "HR_B",5
        );

        int total =
                map.entrySet()
                   .stream()
                   .filter(e -> e.getKey().startsWith("IT"))
                   .mapToInt(Map.Entry::getValue)
                   .sum();

        System.out.println(total);
    }
}
