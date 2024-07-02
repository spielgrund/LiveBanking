package com.spielgrund.LiveBanking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionServiceTest {

    @Test
    public void testfindAllByAccountNumber() {
        List<Transaction> listTransaction = CreateFakeTransactions.FakeTransactions(5);

        List<Transaction> listFromFindAllByAccountNumber = TransactionService.findAllByAccountNumber(1);
        for(Transaction transaction : listFromFindAllByAccountNumber){
            System.out.println(transaction);
        }

        assertEquals(listTransaction.size(), listFromFindAllByAccountNumber.size()
                , "List with Transactions is same Size");
        assertEquals(listTransaction.getFirst(), listFromFindAllByAccountNumber.getFirst()
                , "First Transactions are equal");
        assertEquals(listTransaction.getLast(), listFromFindAllByAccountNumber.getLast()
                , "Last Transactions are equal");

    }
}
