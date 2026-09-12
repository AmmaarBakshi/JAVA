import java.util.*;
import java.util.stream.*;

public class ShortestPath {

    public static void main(String[] args) {

        Map<Integer,List<Integer>> graph =
            Map.of(
                1, List.of(2,3),
                2, List.of(4),
                3, List.of(4),
                4, List.of(5),
                5, List.of()
            );

        Queue<List<Integer>> queue =
            new LinkedList<>();

        queue.add(List.of(1));

        Set<Integer> visited =
            new HashSet<>();

        while (!queue.isEmpty()) {

            List<Integer> path =
                queue.poll();

            int node =
                path.get(path.size()-1);

            if (node == 5) {
                System.out.println(path);
                break;
            }

            if (!visited.add(node))
                continue;

            graph.getOrDefault(
                    node,
                    List.of()
                  )
                  .stream()
                  .map(
                      next ->
                      Stream.concat(
                          path.stream(),
                          Stream.of(next)
                      ).toList()
                  )
                  .forEach(
                      queue::add
                  );
        }
    }
}
