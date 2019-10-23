package pl.krakow.uek.pp5.creditcard.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {

    public static final int LIMIT = 2000;

    @Test
    public void itAllowsAssigningCreditToCard(){

        CreditCard card = new CreditCard("1234443");

        card.AssignLimit(BigDecimal.valueOf(LIMIT));
        Assert.assertTrue(card.getLiit().equals(BigDecimal.valueOf(LIMIT)));

    }

}
