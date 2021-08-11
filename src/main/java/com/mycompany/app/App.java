package com.mycompany.app;

import java.lang.reflect.Array;
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

        // beaver_4, wombat_3, jungle_2, koala_2

        Map<String, Integer> sorted = new TreeMap<>();

        for (String transaction : transactions) {
            if (!sorted.containsKey(transaction)) {
                sorted.put(transaction, 1);
                continue;
            }
            sorted.put(transaction, sorted.get(transaction) + 1);
        }

        class Ent {
            public final String transaction;
            public final Integer amount;
            Ent(String transaction, Integer amount) {
                this.transaction = transaction;
                this.amount = amount;
            }
        }

        List<Ent> ents = new ArrayList<Ent>();

        for (Map.Entry<String, Integer> entry: sorted.entrySet()) {
            ents.add(new Ent(entry.getKey(), entry.getValue()));
        }

        ents.sort((Ent x, Ent y) -> {return y.amount - x.amount;});

        ents.forEach(
                (Ent x) -> System.out.println(x.transaction + " " + x.amount)
        );

    }
}
