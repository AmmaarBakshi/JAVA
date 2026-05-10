import java.util.*;

public class ParityList {

    public static void main(String[] args){

        Random r=new Random();

        for(int i=0;i<10;i++){
            int n=r.nextInt(100);
            System.out.println(n+" -> "+(n%2==0?"Even":"Odd"));
        }
    }
}
