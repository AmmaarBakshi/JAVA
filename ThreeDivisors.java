import java.util.stream.*;

public class ThreeDivisors {

    static boolean prime(int n){

        if(n<2) return false;

        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        IntStream.rangeClosed(1,10000)
                 .filter(n -> {

                     int root =
                         (int)Math.sqrt(n);

                     return root*root==n
                            && prime(root);
                 })
                 .forEach(System.out::println);
    }
}
