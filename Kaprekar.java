import java.util.stream.*;

public class Kaprekar {

    public static void main(String[] args){

        IntStream.rangeClosed(1,1000)
                 .filter(n -> {

                     long sq = (long)n*n;
                     String s = String.valueOf(sq);

                     for(int i=1;i<s.length();i++){

                         int a =
                             Integer.parseInt(
                                 s.substring(0,i));

                         int b =
                             Integer.parseInt(
                                 s.substring(i));

                         if(b!=0 && a+b==n)
                             return true;
                     }

                     return n==1;
                 })
                 .forEach(System.out::println);
    }
}
