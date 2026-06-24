import java.util.*;
import java.util.stream.*;

public class StatisticsDemo {

    public static void main(String[] args) {

        IntSummaryStatistics stats =
                List.of(10,20,30,40,50)
                    .stream()
                    .collect(
                        Collectors.summarizingInt(
                            Integer::intValue
                        )
                    );

        System.out.println(stats);
    }
}
