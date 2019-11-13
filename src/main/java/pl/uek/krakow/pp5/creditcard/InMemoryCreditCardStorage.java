package pl.uek.krakow.pp5.creditcard;

import java.util.HashMap;


public class InMemoryCreditCardStorage implements CreditCardStorage {
    private final HashMap<String, CreditCard> cards;

    public InMemoryCreditCardStorage() {
        this.cards = new HashMap<String, CreditCard>();
    }

    public void add(CreditCard cc) {
        this.cards.put(cc.cardNumber, cc);
    }

    public CreditCard load(String creditCardNumber) {
        return this.cards.get(creditCardNumber);
    }
}
