import java.util.*;
import java.util.stream.*;

record Dependency(
    String task,
    String dependsOn
) {}

public class TaskDependencies {

    public static void main(String[] args) {

        List<Dependency> dependencies =
            List.of(
                new Dependency("Compile","Code"),
                new Dependency("Test","Compile"),
                new Dependency("Deploy","Test")
            );

        Map<String,List<String>> graph =
            dependencies.stream()
                        .collect(
                            Collectors.groupingBy(
                                Dependency::dependsOn,
                                Collectors.mapping(
                                    Dependency::task,
                                    Collectors.toList()
                                )
                            )
                        );

        graph.forEach(
            (task,next) ->
            System.out.println(
                task + " -> " + next
            )
        );

        System.out.println(
            "\nDependency Graph:"
        );

        dependencies.stream()
                    .flatMap(
                        d ->
                        Stream.of(
                            d.dependsOn()
                            + " -> "
                            + d.task()
                        )
                    )
                    .forEach(
                        System.out::println
                    );
    }
}
