import java.util.stream.*;

public class DigitalRoot {

    static int root(int n){

        while(n > 9){
            n = String.valueOf(n)
                    .chars()
                    .map(c -> c - '0')
                    .sum();
        }

        return n;
    }

    public static void main(String[] args){

        IntStream.of(12345,9999,777)
                 .map(DigitalRoot::root)
                 .forEach(System.out::println);
    }
}
