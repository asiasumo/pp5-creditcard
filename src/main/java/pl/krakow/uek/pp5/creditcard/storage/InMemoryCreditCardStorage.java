package pl.krakow.uek.pp5.creditcard.storage;

import pl.krakow.uek.pp5.creditcard.domain.CreditCard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


public class InMemoryCreditCardStorage implements CreditCardStorage {
    private final ConcurrentHashMap<String, CreditCard> cards;

    public InMemoryCreditCardStorage() {
        this.cards = new ConcurrentHashMap<>();
        CreditCard karta = new CreditCard("123");
        karta.assignLimit(new BigDecimal(1000));
        karta.insertMoney(new BigDecimal(20));

        cards.put("123",karta);
    }

    @Override
    public void add(CreditCard cc) {
        this.cards.put(cc.getCardNumber(), cc);
    }

    @Override
    public CreditCard load(String creditCardNumber) {

        return this.cards.get(creditCardNumber);
    }

    @Override
    public List<CreditCard> all() {
        return new ArrayList<>(cards.values());
    }
}
