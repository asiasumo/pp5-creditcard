package pl.krakow.uek.pp5.creditcard.facade;

import pl.krakow.uek.pp5.creditcard.controller.WithdrawCommand;

public interface CreditCardFacade {
	void withdraw(WithdrawCommand withdrawCommand);
}
