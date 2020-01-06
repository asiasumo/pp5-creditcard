package pl.krakow.uek.pp5.creditcard.facade;

import pl.krakow.uek.pp5.creditcard.domain.CreditCard;
import pl.krakow.uek.pp5.creditcard.domain.dto.CardBalanceDto;
import pl.krakow.uek.pp5.creditcard.storage.CreditCardStorage;
import pl.krakow.uek.pp5.creditcard.controller.WithdrawCommand;
import pl.krakow.uek.pp5.creditcard.storage.models.CreditCardData;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<CardBalanceDto> getAll() {
        return storage.all()
                .stream()
                .map(card ->
                        CardBalanceDto.builder()
                        .cardNumber(card.getCardNumber())
                        .balance(card.getCurrentBalance())
                        .build())
                .collect(Collectors.toList());



    }
}
