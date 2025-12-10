package com.cydeo;

import java.util.Comparator;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        //1.get all transactions in 2011 and sort by value
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2.what are all unique cities where the traders work?
        System.out.println("===================================");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3.Find all traders from urumqi and sort them by name
        System.out.println("===================================");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("urumqi"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);
        //4.return a string of all trader's names sorted alphabetically
        System.out.println("===================================");
        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2) -> name1+name2 + " ");
        System.out.println(result);

        //5.are any traders based in ghulja
        System.out.println("===================================");
        boolean ghuljaBase = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("ghulja"));
        System.out.println(ghuljaBase);




        //6.print the values of all transactions from th traders living in urumqi
        System.out.println("===================================");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("urumqi"))
                        .map(Transaction::getValue)
                                .forEach(System.out::println);



        //7.what is the highest value of all the transactions
        System.out.println("===================================");
        Optional<Integer> result2 = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                        .reduce(Integer::max);
        System.out.println(result2);

        //8.find the transaction with the smallest value
        System.out.println("===================================");
        Optional<Transaction> result3 = TransactionData.getAll().stream()
                .reduce((t1, t2) ->t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(result3);
        //second way
        Optional <Transaction> result31 = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(result31.get());

    }
}
