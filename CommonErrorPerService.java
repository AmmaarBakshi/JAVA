import java.util.*;
import java.util.function.*;
import java.util.stream.*;

record Log(
    String service,
    int errorCode
) {}

public class CommonErrorPerService {

    public static void main(String[] args) {

        List<Log> logs =
            List.of(
                new Log("Auth",500),
                new Log("Auth",404),
                new Log("Auth",500),

                new Log("Payment",400),
                new Log("Payment",500),
                new Log("Payment",500)
            );

        logs.stream()
            .collect(
                Collectors.groupingBy(
                    Log::service,
                    Collectors.groupingBy(
                        Log::errorCode,
                        Collectors.counting()
                    )
                )
            )
            .forEach(
                (service,errors) ->

                    errors.entrySet()
                          .stream()
                          .max(
                              Map.Entry
                              .comparingByValue()
                          )
                          .ifPresent(
                              result ->
                              System.out.println(
                                  service
                                  + " -> "
                                  + result
                              )
                          )
            );
    }
}
