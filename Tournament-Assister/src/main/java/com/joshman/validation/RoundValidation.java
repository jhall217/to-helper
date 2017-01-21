package com.joshman.validation;

import org.junit.Assert;

import com.joshman.model.Player;
import com.joshman.model.Round;
import com.joshman.model.Table;
import com.joshman.model.errors.RoundError;

public class RoundValidation {

	public static void validateRound(Round round) {

		Assert.assertTrue(RoundError.MINIMUM_TABLES_REQUIRED.getMessage(),
				round.getTables().size() > 1);

		for (Table table : round.getTables()) {
			validateTables(table);
		}

	}

	private static void validateTables(Table table) {
		Assert.assertTrue(RoundError.INCORRECT_PLAYER_NUMBERS.getMessage(),
				table.getPlayers().size() == 2);

		for (Player player : table.getPlayers()) {
			PlayerValidation.validatePlayer(player);
		}
	}

}
