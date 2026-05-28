import java.util.*;
import java.util.stream.*;

class Student{
    String dept;
    int year;
    String name;

    Student(String d,int y,String n){
        dept=d;
        year=y;
        name=n;
    }
}

public class NestedMap {

    public static void main(String[] args){

        List<Student> list=List.of(
            new Student("CS",1,"A"),
            new Student("CS",2,"B"),
            new Student("IT",1,"C")
        );

        var map =
            list.stream()
                .collect(Collectors.groupingBy(
                    s->s.dept,
                    Collectors.groupingBy(
                        s->s.year
                    )
                ));

        System.out.println(map);
    }
}
