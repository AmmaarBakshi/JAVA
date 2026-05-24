import java.util.*;
import java.util.stream.*;

class Dev{
    String dept;
    int salary;

    Dev(String d,int s){
        dept=d;
        salary=s;
    }
}

public class AvgSalaryDept {

    public static void main(String[] args){

        List<Dev> list=List.of(
            new Dev("IT",5000),
            new Dev("IT",7000),
            new Dev("HR",4000)
        );

        Map<String,Double> map =
            list.stream()
                .collect(Collectors.groupingBy(
                    d->d.dept,
                    Collectors.averagingInt(d->d.salary)
                ));

        System.out.println(map);
    }
}
