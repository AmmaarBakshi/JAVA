import java.util.*;
import java.util.stream.*;

record Employee(
    String name,
    String department,
    int salary
) {}

public class MiniSqlQuery {

    public static void main(String[] args) {

        List<Employee> employees =
            List.of(
                new Employee("Alex", "IT", 90000),
                new Employee("Sam", "IT", 85000),
                new Employee("John", "IT", 60000),
                new Employee("Emma", "HR", 95000),
                new Employee("Mike", "HR", 50000)
            );

        /*
           SQL equivalent:

           SELECT department,
                  AVG(salary)
           FROM employees
           WHERE salary > 60000
           GROUP BY department
           HAVING AVG(salary) > 70000
           ORDER BY AVG(salary) DESC;
        */

        employees.stream()

                 // WHERE
                 .filter(
                     e -> e.salary() > 60000
                 )

                 // GROUP BY + AVG
                 .collect(
                     Collectors.groupingBy(
                         Employee::department,
                         Collectors.averagingInt(
                             Employee::salary
                         )
                     )
                 )

                 // HAVING
                 .entrySet()
                 .stream()
                 .filter(
                     e -> e.getValue() > 70000
                 )

                 // ORDER BY DESC
                 .sorted(
                     Map.Entry
                     .<String,Double>
                     comparingByValue()
                     .reversed()
                 )

                 .forEach(
                     System.out::println
                 );
    }
}
