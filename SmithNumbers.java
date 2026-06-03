import java.util.stream.*;

public class SmithNumbers {

    static int digitSum(int n){

        return String.valueOf(n)
                .chars()
                .map(c -> c-'0')
                .sum();
    }

    public static void main(String[] args){

        IntStream.rangeClosed(4,100)
                 .filter(n ->
                     digitSum(n)%2==0
                 )
                 .forEach(System.out::println);
    }
}
