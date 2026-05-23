import java.util.*;
import java.util.stream.*;

public class WordLengthMap {

    public static void main(String[] args){

        String s="java streams are powerful";

        Map<String,Integer> map =
            Arrays.stream(s.split(" "))
                  .collect(Collectors.toMap(
                      w->w,
                      String::length
                  ));

        System.out.println(map);
    }
}
