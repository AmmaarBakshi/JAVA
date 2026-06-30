import java.util.*;

public class PrimeCount {

    static boolean prime(int n){

        if(n<2) return false;

        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        List<Integer> nums=
            List.of(2,3,4,5,6,7,8,11);

        long count=
            nums.stream()
                .filter(PrimeCount::prime)
                .count();

        System.out.println(count);
    }
}
