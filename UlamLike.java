import java.util.*;
import java.util.stream.*;

public class UlamLike {

    public static void main(String[] args){

        List<Integer> seq =
            new ArrayList<>(List.of(1,2));

        while(seq.size()<20){

            int n = seq.get(seq.size()-1)+1;

            while(true){

                int count = 0;

                for(int i=0;i<seq.size();i++)
                    for(int j=i+1;j<seq.size();j++)
                        if(seq.get(i)+seq.get(j)==n)
                            count++;

                if(count==1){
                    seq.add(n);
                    break;
                }

                n++;
            }
        }

        seq.stream()
           .
