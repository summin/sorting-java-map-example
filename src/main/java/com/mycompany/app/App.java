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

    }
}
