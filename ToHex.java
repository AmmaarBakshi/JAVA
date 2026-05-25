import java.util.*;

public class ToHex {

    public static void main(String[] args){

        List<Integer> list=List.of(10,15,255);

        list.stream()
            .map(Integer::toHexString)
            .forEach(System.out::println);
    }
}
