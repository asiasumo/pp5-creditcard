package pl.uek.krakow.pp5.creditcard;

public interface CreditCardStorage {
    void add(CreditCard cc);

    CreditCard load(String creditCardNumber);
}
