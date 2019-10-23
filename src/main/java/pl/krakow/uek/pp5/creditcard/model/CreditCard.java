package pl.krakow.uek.pp5.creditcard.model;

import java.math.BigDecimal;

public class CreditCard {


    String cardNumber;
    private BigDecimal cardLimit;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;

    }




    public void AssignLimit(BigDecimal newLimit) {
        cardLimit  = newLimit;

    }

    public BigDecimal getLiit() {
        return cardLimit;
    }
}
