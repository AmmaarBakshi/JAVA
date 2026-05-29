import java.util.stream.*;

public class RunLength {

    public static void main(String[] args){

        String s = "aaabbbcc";

        IntStream.range(0,s.length())
                 .filter(i ->
                     i==0 ||
                     s.charAt(i)!=s.charAt(i-1))
                 .forEach(i->{
                     long count =
                         s.substring(i)
                          .chars()
                          .takeWhile(c ->
                              c==s.charAt(i))
                          .count();

                     System.out.print(
                         ""+s.charAt(i)+count);
                 });
    }
}
