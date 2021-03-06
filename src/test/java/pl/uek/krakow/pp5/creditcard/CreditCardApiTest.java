package pl.uek.krakow.pp5.creditcard;

import org.junit.Assert;
import org.junit.Test;
import pl.krakow.uek.pp5.creditcard.controller.WithdrawCommand;
import pl.krakow.uek.pp5.creditcard.domain.CreditCard;
import pl.krakow.uek.pp5.creditcard.facade.CreditCardFacadeImpl;
import pl.krakow.uek.pp5.creditcard.storage.CreditCardStorage;
import pl.krakow.uek.pp5.creditcard.storage.InMemoryCreditCardStorage;

import java.math.BigDecimal;

public class CreditCardApiTest {

    public static final String CREDIT_CARD_NUMBER = "123";
    public static final BigDecimal CC_LIMIT = BigDecimal.valueOf(1000);
    private CreditCardStorage storage;
    private CreditCardFacadeImpl api;

    @Test
    public void iAmAbleToWithdrawFromCard() {
        thereIsCCPermanentStorage();
        thereIsCreditCard(CREDIT_CARD_NUMBER);
        thereIsCCApi();


        api.withdraw(new WithdrawCommand(CREDIT_CARD_NUMBER, BigDecimal.valueOf(1)));

        ccWithNumberBalanceEquals(CREDIT_CARD_NUMBER, BigDecimal.valueOf(19));
    }

    private void ccWithNumberBalanceEquals(String creditCardNumber, BigDecimal moneyLeft) {
        CreditCard cc = storage.load(creditCardNumber);
        Assert.assertEquals(cc.getCurrentBalance(), moneyLeft);
    }

    private void thereIsCCPermanentStorage() {
        this.storage = new InMemoryCreditCardStorage();
    }

    private void thereIsCreditCard(String creditCardNumber) {
        CreditCard cc = new CreditCard(creditCardNumber);
        cc.assignLimit(CC_LIMIT);

        this.storage.add(cc);
    }

    private void thereIsCCApi() {
        this.api = new CreditCardFacadeImpl(this.storage);
    }
}