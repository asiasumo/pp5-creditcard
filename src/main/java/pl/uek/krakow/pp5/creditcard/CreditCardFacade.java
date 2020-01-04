package pl.uek.krakow.pp5.creditcard;

import pl.krakow.uek.pp5.creditcard.domain.CreditCard;

public class CreditCardFacade {

    private final CreditCardStorage storage;

    public CreditCardFacade(CreditCardStorage creditCardStorage) {
        this.storage = creditCardStorage;
    }

    public void withdraw(WithdrawCommand withdrawCommand) {
        CreditCard loaded = storage.load(withdrawCommand.getCCNumber());

        loaded.withdraw(withdrawCommand.getAmount());

        storage.add(loaded);
    }
}
