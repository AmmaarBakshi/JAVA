import java.util.*;
import java.util.stream.*;

public class PrimePartition {

    static boolean prime(int n){
        if(n<2) return false;

        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        Map<Boolean,List<Integer>> map =
            IntStream.rangeClosed(1,20)
                     .boxed()
                     .collect(Collectors.partitioningBy(
                         PrimePartition::prime
                     ));

        System.out.println(map);
    }
}
