package pl.uek.krakow.pp5.creditcard;

import java.math.BigDecimal;

public class CreditCard {


    private String cardNumber;
    private BigDecimal cardLimit;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;

    }




    public void assignLimit(BigDecimal newLimit) {
        cardLimit  = newLimit;

    }

    public BigDecimal getLimit() {
        return cardLimit;
    }


    public void withdraw(BigDecimal valueOf) {
    }

    public BigDecimal getCurrentBalance() {
        return BigDecimal.valueOf(500);
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
