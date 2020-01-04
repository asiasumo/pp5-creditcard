package pl.krakow.uek.pp5.creditcard.storage;

import pl.krakow.uek.pp5.creditcard.domain.CreditCard;

public interface CreditCardStorage {
    void add(CreditCard cc);

    CreditCard load(String creditCardNumber);
}
