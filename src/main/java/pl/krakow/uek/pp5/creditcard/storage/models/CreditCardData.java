package pl.krakow.uek.pp5.creditcard.storage.models;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
public class CreditCardData {
	String cardNumber;
	BigDecimal limit;
	BigDecimal balance;
}
