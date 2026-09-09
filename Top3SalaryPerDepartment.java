import java.util.*;
import java.util.stream.*;

record Employee(
    String name,
    String department,
    int salary
) {}

public class Top3SalaryPerDepartment {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee("Alex", "IT", 90000),
            new Employee("Sam", "IT", 85000),
            new Employee("John", "IT", 80000),
            new Employee("Mike", "IT", 70000),

            new Employee("Emma", "HR", 95000),
            new Employee("Sara", "HR", 90000),
            new Employee("Tom", "HR", 75000)
        );

        Map<String, List<Employee>> result =
            employees.stream()
                     .collect(
                         Collectors.groupingBy(
                             Employee::department,
                             Collectors.collectingAndThen(
                                 Collectors.toList(),
                                 list ->
                                     list.stream()
                                         .sorted(
                                             Comparator
                                             .comparingInt(
                                                 Employee::salary
                                             )
                                             .reversed()
                                         )
                                         .limit(3)
                                         .toList()
                             )
                         )
                     );

        result.forEach(
            (dept, list) ->
                System.out.println(
                    dept + " -> " + list
                )
        );
    }
}
