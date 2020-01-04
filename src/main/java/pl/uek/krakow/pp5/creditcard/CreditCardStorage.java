package pl.uek.krakow.pp5.creditcard;

import pl.krakow.uek.pp5.creditcard.domain.CreditCard;

public interface CreditCardStorage {
    void add(CreditCard cc);

    CreditCard load(String creditCardNumber);
}
