package com.spielgrund.LiveBanking;

import java.util.ArrayList;
import java.util.List;

public class CreateFakeTransactions {
    public static List<Transaction> FakeTransactions(int numberOfTransactions){
        List<Transaction> fakeTransactionList = new ArrayList<>();
        for (int i = 1; i <= numberOfTransactions; i++) {
            Transaction t = new Transaction(i);
            fakeTransactionList.add(t);
        }
        return fakeTransactionList;
    }
}
