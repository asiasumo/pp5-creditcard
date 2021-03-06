package pl.uek.krakow.pp5.creditcard;

import org.junit.Assert;
import org.junit.Test;
import pl.krakow.uek.pp5.creditcard.domain.CreditCard;
import pl.krakow.uek.pp5.creditcard.exceptions.CreditBelowLimitException;
import pl.krakow.uek.pp5.creditcard.exceptions.NotEnoughMoneyException;

import java.math.BigDecimal;

public class CreditCardTest {

    public static final int LIMIT = 2000;

    @Test
    public void itAllowsAssigningCreditToCard(){

        CreditCard card = new CreditCard("1234443");

        card.assignLimit(BigDecimal.valueOf(LIMIT));
        Assert.assertTrue(card.getLimit().equals(BigDecimal.valueOf(LIMIT)));

    }



     @Test
     public void creditBelowGeneralLimitNotPossible(){

        //arrange
         //act
         CreditCard card = new CreditCard("1234443");
         //assert
         try{

             card.assignLimit(BigDecimal.valueOf(50));
             Assert.fail("exception should be thrown")
;         }catch (CreditBelowLimitException e) {
             Assert.assertTrue(true);
         }
     }
    @Test
    public void withdrawFromCard(){
        CreditCard card1 = new CreditCard("1234-5678");
        CreditCard card2 = new CreditCard("1234-5679");
        card1.assignLimit(BigDecimal.valueOf(2100));
        card2.assignLimit(BigDecimal.valueOf(1000));
        card1.insertMoney(BigDecimal.valueOf(2200));
        card2.insertMoney(BigDecimal.valueOf(1000));
        card1.withdraw(BigDecimal.valueOf(2000));
        card2.withdraw(BigDecimal.valueOf(100));
        Assert.assertEquals(BigDecimal.valueOf(220),card1.getCurrentBalance());
        Assert.assertEquals(BigDecimal.valueOf(920),card2.getCurrentBalance());

    }

    @Test(expected = NotEnoughMoneyException.class)

    public void denyWithdrawBelowBalance(){

        CreditCard card = new CreditCard("1234-5678");
        card.assignLimit(BigDecimal.valueOf(1000));

        card.withdraw(BigDecimal.valueOf(600));
        card.withdraw(BigDecimal.valueOf(600));



    }

}
