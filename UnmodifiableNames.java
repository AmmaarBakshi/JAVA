import java.util.*;
import java.util.stream.*;

public class UnmodifiableNames {

    public static void main(String[] args) {

        List<String> names =
                List.of("Alex","Sam","John");

        List<String> upper =
                names.stream()
                     .map(String::toUpperCase)
                     .collect(
                         Collectors.toUnmodifiableList()
                     );

        System.out.println(upper);
    }
}
