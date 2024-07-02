package com.spielgrund.LiveBanking;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TransactionService {
    public static List<Transaction> findAllByAccountNumber(int accountNumber){
        return CreateFakeTransactions.FakeTransactions(5);
    }
    public static Transaction getOneTransactions(int accountNumber){
        return new Transaction(accountNumber);
    }
}
