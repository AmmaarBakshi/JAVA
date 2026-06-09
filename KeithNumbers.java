import java.util.*;
import java.util.stream.*;

public class KeithNumbers {

    static boolean keith(int n){

        List<Integer> seq =
            String.valueOf(n)
                  .chars()
                  .map(c->c-'0')
                  .boxed()
                  .collect(Collectors.toList());

        while(true){

            int next =
                seq.stream()
                   .skip(seq.size()-String.valueOf(n).length())
                   .mapToInt(Integer::intValue)
                   .sum();

            if(next==n) return true;
            if(next>n) return false;

            seq.add(next);
        }
    }

    public static void main(String[] args){

        IntStream.rangeClosed(10,1000)
                 .filter(KeithNumbers::keith)
                 .forEach(System.out::println);
    }
}
