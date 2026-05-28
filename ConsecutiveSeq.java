import java.util.*;

public class ConsecutiveSeq {

    public static void main(String[] args){

        List<Integer> list=
            List.of(1,2,3,7,8,10);

        int longest=1,current=1;

        List<Integer> sorted=
            list.stream().sorted().toList();

        for(int i=1;i<sorted.size();i++){

            if(sorted.get(i)==sorted.get(i-1)+1)
                current++;
            else
                current=1;

            longest=Math.max(longest,current);
        }

        System.out.println(longest);
    }
}
