package com.mycompany.app;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> transactions = new ArrayList<>();

        transactions.add("wombat");
        transactions.add("wombat");
        transactions.add("wombat");
        transactions.add("jungle");
        transactions.add("jungle");
        transactions.add("koala");
        transactions.add("koala");
        transactions.add("beaver");
        transactions.add("beaver");
        transactions.add("beaver");
        transactions.add("beaver");

        // sort above in:
        // 1. by amounts
        // 2. alphabetical order
        // expected output:
        // beaver_4, wombat_3, jungle_2, koala_2

        Map<String, Integer> sorted = new TreeMap<>();

        for (String transaction : transactions) {
            if (!sorted.containsKey(transaction)) {
                sorted.put(transaction, 1);
                continue;
            }
            sorted.put(transaction, sorted.get(transaction) + 1);
        }

        class Transaction {
            public final String transaction;
            public final Integer amount;
            Transaction(String transaction, Integer amount) {
                this.transaction = transaction;
                this.amount = amount;
            }
        }

        List<Transaction> transactionsList = new ArrayList<Transaction>();

        for (Map.Entry<String, Integer> entry: sorted.entrySet()) {
            transactionsList.add(new Transaction(entry.getKey(), entry.getValue()));
        }

        transactionsList.sort((Transaction x, Transaction y) -> {return y.amount - x.amount;});

        transactionsList.forEach(
                (Transaction x) -> System.out.println(x.transaction + "_" + x.amount)
        );

    }
}
