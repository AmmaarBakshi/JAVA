import java.util.stream.*;

public class PrimeBinaryLength {

    static boolean prime(int n){

        if(n<2) return false;

        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        IntStream.rangeClosed(1,500)
                 .filter(n ->
                     prime(
                         Integer.toBinaryString(n)
                                .length()
                     ))
                 .forEach(System.out::println);
    }
}
