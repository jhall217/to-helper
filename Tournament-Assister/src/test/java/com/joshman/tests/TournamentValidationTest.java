package com.joshman.tests;

import org.junit.Assert;
import org.junit.Test;

import com.joshman.model.errors.TournamentError;
import com.joshman.tests.utils.TestDataBuilder;
import com.joshman.validation.TournamentValidation;

public class TournamentValidationTest {

    private final TestDataBuilder dataBuilder = new TestDataBuilder();

    @Test
    public void testValidateTournament() {
        TournamentValidation.validateTournament(dataBuilder
                .populateTournament());
    }

    @Test
    public void testInvalidRoundNumber() {

        try {
            TournamentValidation.validateTournament(dataBuilder
                    .invalidTournament());
            Assert.fail("Validataion did not throw an error");
        } catch (AssertionError error) {
            Assert.assertEquals(error.getMessage(),
                    TournamentError.INVALID_ROUNDS.getMessage());
        }
    }
}