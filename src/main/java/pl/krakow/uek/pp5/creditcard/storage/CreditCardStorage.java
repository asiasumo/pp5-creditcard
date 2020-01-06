package pl.krakow.uek.pp5.creditcard.storage;

import pl.krakow.uek.pp5.creditcard.domain.CreditCard;

import java.util.List;

public interface CreditCardStorage {
    void add(CreditCard cc);

    CreditCard load(String creditCardNumber);

    List<CreditCard> all();
}
