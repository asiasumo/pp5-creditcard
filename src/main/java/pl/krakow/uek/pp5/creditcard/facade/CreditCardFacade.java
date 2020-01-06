package pl.krakow.uek.pp5.creditcard.facade;

import pl.krakow.uek.pp5.creditcard.controller.WithdrawCommand;
import pl.krakow.uek.pp5.creditcard.domain.dto.CardBalanceDto;

import java.util.List;

public interface CreditCardFacade {
	void withdraw(WithdrawCommand withdrawCommand);
	List<CardBalanceDto> getAll();

}
