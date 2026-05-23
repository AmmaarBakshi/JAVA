import java.util.*;
import java.util.stream.*;

public class MissingNumber {

    public static void main(String[] args){

        List<Integer> list=List.of(1,2,3,5,6);

        int n=6;

        int expected =
            IntStream.rangeClosed(1,n).sum();

        int actual =
            list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(expected-actual);
    }
}
