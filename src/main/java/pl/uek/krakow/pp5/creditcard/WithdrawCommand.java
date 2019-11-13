package pl.uek.krakow.pp5.creditcard;

import java.math.BigDecimal;

public class WithdrawCommand {
    private final String creditCardNumber;
    private final BigDecimal bigDecimal;

    public WithdrawCommand(String creditCardNumber, BigDecimal bigDecimal) {
        this.creditCardNumber = creditCardNumber;
        this.bigDecimal = bigDecimal;
    }



}
