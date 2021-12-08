package com.joshman.validation;

import com.joshman.model.Round;
import com.joshman.model.Table;
import com.joshman.model.errors.RoundError;
import org.junit.Assert;

public class RoundValidation {

	public static void validateRound(Round round) {

		Assert.assertTrue(RoundError.MINIMUM_TABLES_REQUIRED.getMessage(),
				round.getTables().size() > 1);
		round.getTables().forEach(RoundValidation::validateTable);

	}

	private static void validateTable(Table table) {
		Assert.assertEquals(RoundError.INCORRECT_PLAYER_NUMBERS.getMessage(), 2, table.getPlayers().size());
		table.getPlayers().forEach(PlayerValidation::validatePlayer);
	}

}
