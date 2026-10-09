import java.util.*;
import java.util.stream.*;

public class InvertedSearchIndex {

    public static void main(String[] args) {

        List<String> documents = List.of(
            "Java powers backend systems",
            "Java supports streams",
            "Backend systems process data"
        );

        Map<String, Set<Integer>> index =
            IntStream.range(0, documents.size())
                .boxed()
                .flatMap(id ->
                    Arrays.stream(
                        documents.get(id)
                            .toLowerCase()
                            .split("\\W+")
                    )
                    .distinct()
                    .map(word -> Map.entry(word, id))
                )
                .collect(Collectors.groupingBy(
                    Map.Entry::getKey,
                    Collectors.mapping(
                        Map.Entry::getValue,
                        Collectors.toSet()
                    )
                ));

        index.forEach(
            (word, ids) ->
                System.out.println(word + " -> " + ids)
        );
    }
}
