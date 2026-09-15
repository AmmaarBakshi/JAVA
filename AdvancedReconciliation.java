import java.util.*;
import java.util.stream.*;

record Transaction(
    String id,
    double amount
) {}

public class AdvancedReconciliation {

    public static void main(String[] args) {

        List<Transaction> bank =
            List.of(
                new Transaction("T1",500),
                new Transaction("T2",700),
                new Transaction("T3",900)
            );

        List<Transaction> system =
            List.of(
                new Transaction("T1",500),
                new Transaction("T2",750),
                new Transaction("T4",300)
            );

        Map<String,Transaction> systemMap =
            system.stream()
                  .collect(
                      Collectors.toMap(
                          Transaction::id,
                          t -> t
                      )
                  );

        bank.stream()
            .filter(
                bankTx -> {

                    Transaction systemTx =
                        systemMap.get(
                            bankTx.id()
                        );

                    return systemTx == null
                           ||
                           systemTx.amount()
                           != bankTx.amount();
                }
            )
            .forEach(
                tx ->
                System.out.println(
                    "Mismatch: " + tx
                )
            );

        system.stream()
              .filter(
                  tx ->
                  bank.stream()
                      .noneMatch(
                          b ->
                          b.id().equals(tx.id())
                      )
              )
              .forEach(
                  tx ->
                  System.out.println(
                      "Missing in bank: " + tx
                  )
              );
    }
}
