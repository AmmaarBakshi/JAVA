import java.util.*;
import java.util.stream.*;

public class Recaman {

    public static void main(String[] args){

        Set<Integer> seen =
            new HashSet<>();

        int current = 0;

        seen.add(0);

        IntStream.rangeClosed(1,30)
                 .forEach(i->{

                     int next =
                         current-i;

                     if(next<0 ||
                        seen.contains(next))
                         next=current+i;

                     seen.add(next);

                     System.out.println(next);

                     currentHolder.value=next;
                 });
    }

    static class currentHolder{
        static int value=0;
    }
}
