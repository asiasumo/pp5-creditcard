package pl.krakow.uek.pp5.creditcard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.krakow.uek.pp5.creditcard.facade.CreditCardFacade;
import pl.krakow.uek.pp5.creditcard.facade.CreditCardFacadeImpl;
import pl.krakow.uek.pp5.creditcard.storage.InMemoryCreditCardStorage;

@Configuration
public class CreditCardConfiguration {

	@Bean
	CreditCardFacade creditCardFacade() {
		return new CreditCardFacadeImpl(new InMemoryCreditCardStorage());
	}
	//mogłaby być inna implementacja na przyklad do testów girl

}
