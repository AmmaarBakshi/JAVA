import java.util.*;

public class LogFilter {

    public static void main(String[] args){

        List<String> logs=List.of(
            "INFO Started",
            "ERROR Failed",
            "WARN Memory"
        );

        logs.stream()
            .filter(x->x.startsWith("ERROR"))
            .forEach(System.out::println);
    }
}
