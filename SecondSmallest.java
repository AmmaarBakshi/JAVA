import java.util.*;

public class SecondSmallest {

    public static void main(String[] args){

        List<Integer> nums=
            List.of(8,3,1,9,4,1,2);

        int result=
            nums.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println(result);
    }
}
