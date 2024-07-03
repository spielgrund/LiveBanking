package com.spielgrund.LiveBanking;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Transaction {
    private String type;
    private LocalDate date;
    private int accountNumber;
    private double currency;
    private int ammount;
    private String merchantName;
    private String merchantLogo;


public Transaction(int accountNumber){
    this.accountNumber = accountNumber;
}

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", accountNumber=" + accountNumber +
                ", currency='" + currency + '\'' +
                ", ammount=" + ammount +
                ", merchantName='" + merchantName + '\'' +
                ", merchantLogo='" + merchantLogo + '\'' +
                '}';
    }
}
