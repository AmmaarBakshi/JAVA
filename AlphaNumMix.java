import java.util.*;

public class AlphaNumMix {

    public static void main(String[] args){

        String chars="abc123";

        Random r=new Random();

        for(int i=0;i<12;i++)
            System.out.print(chars.charAt(r.nextInt(chars.length())));
    }
}
