package pl.uek.krakow.pp5.creditcard;

import java.math.BigDecimal;

public class WithdrawCommand {
    private final String creditCardNumber;
    private final BigDecimal amount;

    public WithdrawCommand(String creditCardNumber, BigDecimal bigDecimal) {
        this.creditCardNumber = creditCardNumber;
        this.amount = bigDecimal;
    }


    public String getCCNumber() {
        return creditCardNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
