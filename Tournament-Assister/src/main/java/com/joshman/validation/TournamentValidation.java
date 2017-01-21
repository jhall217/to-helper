package com.joshman.validation;

import java.util.List;

import org.junit.Assert;

import com.joshman.model.Round;
import com.joshman.model.Tournament;
import com.joshman.model.errors.TournamentError;

public class TournamentValidation {

	public static void validateTournament(Tournament tournament) {

		Assert.assertNotNull(TournamentError.TOURNAMENT_NULL.getMessage(),
				tournament);
		List<Round> rounds = tournament.getRounds();

		Assert.assertTrue(TournamentError.INVALID_ROUNDS.getMessage(),
				rounds.size() > 2);
		for (Round round : rounds) {
			RoundValidation.validateRound(round);
		}

	}

}
