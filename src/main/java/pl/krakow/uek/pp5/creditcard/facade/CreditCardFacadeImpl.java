package pl.krakow.uek.pp5.creditcard.facade;

import pl.krakow.uek.pp5.creditcard.domain.CreditCard;
import pl.krakow.uek.pp5.creditcard.storage.CreditCardStorage;
import pl.krakow.uek.pp5.creditcard.controller.WithdrawCommand;

public class CreditCardFacadeImpl implements CreditCardFacade {

    private final CreditCardStorage storage;

    public CreditCardFacadeImpl(CreditCardStorage creditCardStorage) {
        this.storage = creditCardStorage;
    }

    @Override
    public void withdraw(WithdrawCommand withdrawCommand) {
        CreditCard loaded = storage.load(withdrawCommand.getCCNumber());

        loaded.withdraw(withdrawCommand.getAmount());

        storage.add(loaded);
    }
}
