package pl.krakow.uek.pp5.creditcard.controller;

import java.math.BigDecimal;

public class WithdrawCommand {

    private String creditCardNumber;
    private BigDecimal amount;

    public WithdrawCommand() {
    }

    public WithdrawCommand(String creditCardNumber, BigDecimal bigDecimal) {
        this.creditCardNumber = creditCardNumber;
        this.amount = bigDecimal;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCCNumber() {
        return creditCardNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
