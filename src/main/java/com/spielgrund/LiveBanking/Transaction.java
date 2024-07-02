package com.spielgrund.LiveBanking;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Transaction {
    private String type;
    private String date;
    private int accountNumber;
    private String currency;
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
