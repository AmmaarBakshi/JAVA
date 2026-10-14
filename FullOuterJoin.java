import java.util.*;
import java.util.stream.*;

record BankRecord(String id, long amount) {}
record AppRecord(String id, long amount) {}

public class FullOuterJoin {

    public static void main(String[] args) {

        List<BankRecord> bank = List.of(
            new BankRecord("T1", 500),
            new BankRecord("T2", 700),
            new BankRecord("T3", 900)
        );

        List<AppRecord> app = List.of(
            new AppRecord("T1", 500),
            new AppRecord("T2", 750),
            new AppRecord("T4", 300)
        );

        Map<String, BankRecord> bankMap =
            bank.stream().collect(Collectors.toMap(
                BankRecord::id,
                b -> b
            ));

        Map<String, AppRecord> appMap =
            app.stream().collect(Collectors.toMap(
                AppRecord::id,
                a -> a
            ));

        Set<String> allIds =
            Stream.concat(
                bankMap.keySet().stream(),
                appMap.keySet().stream()
            ).collect(Collectors.toCollection(TreeSet::new));

        allIds.stream()
            .map(id -> {
                BankRecord b = bankMap.get(id);
                AppRecord a = appMap.get(id);

                String status;

                if (b == null) {
                    status = "MISSING_FROM_BANK";
                } else if (a == null) {
                    status = "MISSING_FROM_APP";
                } else if (b.amount() != a.amount()) {
                    status = "AMOUNT_MISMATCH";
                } else {
                    status = "MATCHED";
                }

                return id + " -> " + status;
            })
            .forEach(System.out::println);
    }
}
