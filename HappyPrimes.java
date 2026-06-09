import java.util.stream.*;

public class HappyPrimes {

    static boolean prime(int n){
        if(n < 2) return false;

        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;

        return true;
    }

    static int next(int n){
        return String.valueOf(n)
                .chars()
                .map(c -> {
                    int d = c-'0';
                    return d*d;
                })
                .sum();
    }

    static boolean happy(int n){

        for(int i=0;i<20;i++){
            if(n==1) return true;
            n=next(n);
        }

        return false;
    }

    public static void main(String[] args){

        IntStream.rangeClosed(1,500)
                 .filter(HappyPrimes::prime)
                 .filter(HappyPrimes::happy)
                 .forEach(System.out::println);
    }
}
