package pl.krakow.uek.pp5.creditcard.domain;

import pl.uek.krakow.pp5.creditcard.CreditBelowLimitException;
import pl.uek.krakow.pp5.creditcard.NotEnoughMoneyException;

import java.math.BigDecimal;

public class CreditCard {
    private final String cardNumber;
    private BigDecimal cardLimit;
    private BigDecimal balance;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
        this.balance = new BigDecimal(0);
        this.cardLimit = new BigDecimal(100);

    }

    public void assignLimit(BigDecimal newLimit) {
        if (BigDecimal.valueOf(100).compareTo(newLimit) == 1) {
            throw new CreditBelowLimitException();
        }
        cardLimit = newLimit;
    }

    public BigDecimal getLimit() {
        return cardLimit;
    }

    public void withdraw(BigDecimal money) {
        if (balance.compareTo(money) == -1)  {
            throw new NotEnoughMoneyException();
        }

        balance = balance.subtract(money);
    }

    public BigDecimal getCurrentBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }



}