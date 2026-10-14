import java.util.*;
import java.util.stream.*;

public class DependencyOrder {

    public static void main(String[] args) {

        Map<String, List<String>> dependencies = Map.of(
            "Compile", List.of("Code"),
            "Test", List.of("Compile"),
            "Deploy", List.of("Test"),
            "Code", List.of()
        );

        Set<String> completed = new LinkedHashSet<>();

        while (completed.size() < dependencies.size()) {

            List<String> ready =
                dependencies.keySet().stream()
                    .filter(task -> !completed.contains(task))
                    .filter(task ->
                        completed.containsAll(
                            dependencies.get(task)
                        )
                    )
                    .sorted()
                    .toList();

            if (ready.isEmpty()) {
                throw new IllegalStateException(
                    "Circular dependency detected"
                );
            }

            completed.addAll(ready);
        }

        System.out.println(completed);
    }
}
