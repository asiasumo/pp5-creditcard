package pl.krakow.uek.pp5.creditcard.storage;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import pl.krakow.uek.pp5.creditcard.domain.CreditCard;
import pl.krakow.uek.pp5.creditcard.storage.models.CreditCardData;

import java.util.List;

@AllArgsConstructor
public class SqlCreditCardStorage implements CreditCardStorage {
	private JdbcTemplate jdbcTemplate;

	@Override
	public CreditCard load(String creditCardNumber) {
		CreditCardData cardData = jdbcTemplate.queryForObject(
				"Select * from cards WHERE number = ?",
				new Object[]{creditCardNumber},
				BeanPropertyRowMapper.newInstance(CreditCardData.class)
		);

		return CreditCard.of(cardData);
	}

	@Override
	public void add(CreditCard card) {
		jdbcTemplate.update("INSERT INTO 'cards' ('number', 'limit', 'balance')" +
						"VALUES" +
						"(?, ?, ?)",
				card.getCardNumber(),
				card.getLimit(),
				card.getCurrentBalance());
	}

	@Override
	public List<CreditCard> all() {
		return jdbcTemplate.queryForList("Select * from cards", CreditCard.class);
	}
}