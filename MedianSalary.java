import java.util.*;
import java.util.stream.*;

record Employee(
    String department,
    int salary
) {}

public class MedianSalary {

    public static void main(String[] args) {

        List<Employee> employees =
            List.of(
                new Employee("IT",60000),
                new Employee("IT",80000),
                new Employee("IT",100000),

                new Employee("HR",50000),
                new Employee("HR",70000)
            );

        employees.stream()
                 .collect(
                     Collectors.groupingBy(
                         Employee::department,
                         Collectors.mapping(
                             Employee::salary,
                             Collectors.toList()
                         )
                     )
                 )
                 .forEach(
                     (dept, salaries) -> {

                         salaries.sort(
                             Comparator.naturalOrder()
                         );

                         int n =
                             salaries.size();

                         double median;

                         if (n % 2 == 0) {

                             median =
                                 (salaries.get(n/2 - 1)
                                  +
                                  salaries.get(n/2))
                                 / 2.0;

                         } else {

                             median =
                                 salaries.get(n/2);
                         }

                         System.out.println(
                             dept +
                             " -> " +
                             median
                         );
                     }
                 );
    }
}
