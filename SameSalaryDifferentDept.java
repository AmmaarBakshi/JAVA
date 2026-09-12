import java.util.*;
import java.util.stream.*;

record Employee(
    String name,
    String department,
    int salary
) {}

public class SameSalaryDifferentDept {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee("Alex", "IT", 80000),
            new Employee("Sam", "HR", 80000),
            new Employee("John", "IT", 70000),
            new Employee("Emma", "Sales", 80000),
            new Employee("Mike", "HR", 60000)
        );

        employees.stream()
                 .collect(
                     Collectors.groupingBy(
                         Employee::salary
                     )
                 )
                 .values()
                 .stream()
                 .filter(
                     list ->
                     list.stream()
                         .map(Employee::department)
                         .distinct()
                         .count() > 1
                 )
                 .forEach(
                     System.out::println
                 );
    }
}
