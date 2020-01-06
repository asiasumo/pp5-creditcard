package pl.krakow.uek.pp5.creditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krakow.uek.pp5.creditcard.domain.dto.CardBalanceDto;
import pl.krakow.uek.pp5.creditcard.facade.CreditCardFacade;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CreditCardReportingController {

	CreditCardFacade api;

	@Autowired // wstrzykuje CreditCardFacade kiedy jest potrzebny
	public CreditCardReportingController(CreditCardFacade api) {
		this.api = api;
	}

	//http://localhost:8080/api/cards/withdraw

	@PostMapping("/withdraw")
	public void withdraw(@RequestBody WithdrawCommand command) {
		api.withdraw(command);
	}
	@GetMapping("/balances")
	public List<CardBalanceDto> getAll() {
		return api.getAll();
	}
}
