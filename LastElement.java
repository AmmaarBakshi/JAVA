import java.util.*;

public class LastElement {

    public static void main(String[] args){

        List<Integer> nums=
            List.of(10,20,30,40,50);

        int result=
            nums.stream()
                .reduce((a,b)->b)
                .orElse(-1);

        System.out.println(result);
    }
}
