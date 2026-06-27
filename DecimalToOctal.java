import java.util.*;

public class DecimalToOctal {

    public static void main(String[] args){

        List<Integer> nums=
            List.of(8,15,64,100);

        nums.stream()
            .map(Integer::toOctalString)
            .forEach(System.out::println);
    }
}
