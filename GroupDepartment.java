import java.util.*;
import java.util.stream.*;

class Staff{
    String name,dept;

    Staff(String n,String d){
        name=n;
        dept=d;
    }
}

public class GroupDepartment {

    public static void main(String[] args){

        List<Staff> list=List.of(
            new Staff("A","IT"),
            new Staff("B","HR"),
            new Staff("C","IT")
        );

        Map<String,List<Staff>> map =
            list.stream()
                .collect(Collectors.groupingBy(
                    s->s.dept
                ));

        System.out.println(map);
    }
}
