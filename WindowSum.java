import java.util.stream.*;

public class WindowSum {

    public static void main(String[] args){

        int[] arr={1,2,3,4,5};

        IntStream.range(0,arr.length-2)
                 .map(i->arr[i]+arr[i+1]+arr[i+2])
                 .forEach(System.out::println);
    }
}
