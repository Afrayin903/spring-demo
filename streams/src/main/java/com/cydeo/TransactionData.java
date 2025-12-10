package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class TransactionData{
    public static List <Transaction> getAll() {
        Trader kasim = new Trader("kasim", "urumqi");
        Trader kamar = new Trader("kamar", "urumqi");
        Trader gulnur = new Trader("gulnur", "urumqi");
        Trader pariza = new Trader("pariza", "ghulja");

        return Arrays.asList(
                new Transaction(kasim, 2011, 500),
                new Transaction(kamar, 2011, 1500),
                new Transaction(gulnur, 2012, 5200),
                new Transaction(pariza, 2012, 700)


        );

    }

}
