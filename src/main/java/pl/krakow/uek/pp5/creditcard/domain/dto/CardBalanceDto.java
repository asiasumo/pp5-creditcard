package pl.krakow.uek.pp5.creditcard.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import pl.krakow.uek.pp5.creditcard.domain.CreditCard;
import pl.krakow.uek.pp5.creditcard.storage.models.CreditCardData;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class CardBalanceDto {
	public String cardNumber;
	public BigDecimal balance;
}

