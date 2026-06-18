import java.util.*;

public class LongestPrefix {

    public static void main(String[] args) {

        List<String> list =
                List.of("stream","street","stress");

        String prefix = list.get(0);

        while(!list.stream().allMatch(s -> s.startsWith(prefix)))
            prefix = prefix.substring(0,prefix.length()-1);

        System.out.println(prefix);
    }
}
