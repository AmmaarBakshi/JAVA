import java.util.*;

public class ThirdLargest {

    public static void main(String[] args){

        List<Integer> nums=
            List.of(10,50,30,20,40,50);

        int result=
            nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElse(-1);

        System.out.println(result);
    }
}
