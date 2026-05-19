import java.util.*;

class Dept{
    List<String> employees;

    Dept(List<String> e){
        employees=e;
    }
}

public class FlattenNames {

    public static void main(String[] args){

        List<Dept> deps=List.of(
            new Dept(List.of("A","B")),
            new Dept(List.of("C","D"))
        );

        deps.stream()
            .flatMap(d->d.employees.stream())
            .forEach(System.out::println);
    }
}
