import java.util.*;

public class ProductStream {

    public static void main(String[] args){

        List<Integer> nums=
            List.of(1,2,3,4,5);

        int product=
            nums.stream()
                .reduce(1,(a,b)->a*b);

        System.out.println(product);
    }
}
