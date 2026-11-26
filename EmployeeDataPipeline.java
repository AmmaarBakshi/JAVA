import java.util.*;
import java.util.stream.*;

public class EmployeeDataPipeline {
    record Employee(
        String name,
        String department,
        double salary,
        int experience
    ) {}

    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Ayaan", "Engineering", 80000, 5),
            new Employee("Sara", "Engineering", 95000, 7),
            new Employee("Kabir", "Marketing", 50000, 3),
            new Employee("Zoya", "Marketing", 70000, 6),
            new Employee("Rehan", "Engineering", 60000, 2),
            new Employee("Maya", "HR", 65000, 4)
        );

        Map<String, List<String>> report = employees.stream()
            .filter(e -> e.experience() >= 3)
            .filter(e -> e.salary() >= 50000)
            .collect(Collectors.groupingBy(
                Employee::department,
                TreeMap::new,
                Collectors.collectingAndThen(
                    Collectors.toList(),
                    list -> list.stream()
                        .sorted(
                            Comparator.comparingDouble(Employee::salary)
                                .reversed()
                        )
                        .map(e -> e.name() + " : ₹" + e.salary())
                        .toList()
                )
            ));

        report.forEach((department, staff) -> {
            System.out.println("\n" + department);

            staff.forEach(System.out::println);
        });
    }
}
