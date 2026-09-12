import java.util.*;

public class CircularDependencies {

    static boolean hasCycle(
            Map<String,List<String>> graph,
            String node,
            Set<String> visiting,
            Set<String> visited) {

        if (visiting.contains(node))
            return true;

        if (visited.contains(node))
            return false;

        visiting.add(node);

        return graph
            .getOrDefault(node, List.of())
            .stream()
            .anyMatch(
                next ->
                hasCycle(
                    graph,
                    next,
                    visiting,
                    visited
                )
            );
    }

    public static void main(String[] args) {

        Map<String,List<String>> dependencies =
            Map.of(
                "A", List.of("B"),
                "B", List.of("C"),
                "C", List.of("A")
            );

        boolean result =
            dependencies.keySet()
                        .stream()
                        .anyMatch(
                            node ->
                            hasCycle(
                                dependencies,
                                node,
                                new HashSet<>(),
                                new HashSet<>()
                            )
                        );

        System.out.println(
            "Cycle = " + result
        );
    }
}
