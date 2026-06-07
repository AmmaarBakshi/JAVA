import java.util.stream.*;

public class LookAndSayGrowth {

    static String next(String s){

        StringBuilder out = new StringBuilder();

        for(int i=0;i<s.length();){

            int j=i;

            while(j<s.length() &&
                  s.charAt(j)==s.charAt(i))
                j++;

            out.append(j-i)
               .append(s.charAt(i));

            i=j;
        }

        return out.toString();
    }

    public static void main(String[] args){

        Stream.iterate("1", LookAndSayGrowth::next)
              .limit(15)
              .map(String::length)
              .forEach(System.out::println);
    }
}
