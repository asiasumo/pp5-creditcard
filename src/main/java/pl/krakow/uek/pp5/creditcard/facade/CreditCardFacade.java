package pl.krakow.uek.pp5.creditcard.facade;

import pl.uek.krakow.pp5.creditcard.WithdrawCommand;

public interface CreditCardFacade {
	void withdraw(WithdrawCommand withdrawCommand);
}
