import java.util.stream.*;

public class HappyNumber {

    static int next(int n){
        return String.valueOf(n)
                     .chars()
                     .map(c -> (c-'0')*(c-'0'))
                     .sum();
    }

    public static void main(String[] args){

        int n = 19;

        boolean happy =
            Stream.iterate(n, HappyNumber::next)
                  .limit(20)
                  .anyMatch(x -> x == 1);

        System.out.println(happy);
    }
}
