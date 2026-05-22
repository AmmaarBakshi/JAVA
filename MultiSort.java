import java.util.*;

class User{
    String name;
    int age;

    User(String n,int a){
        name=n;
        age=a;
    }

    public String toString(){
        return name+" "+age;
    }
}

public class MultiSort {

    public static void main(String[] args){

        List<User> list=List.of(
            new User("Alex",20),
            new User("Sam",18),
            new User("Alex",25)
        );

        list.stream()
            .sorted(
                Comparator.comparing((User u)->u.name)
                          .thenComparing(u->u.age)
            )
            .forEach(System.out::println);
    }
}
