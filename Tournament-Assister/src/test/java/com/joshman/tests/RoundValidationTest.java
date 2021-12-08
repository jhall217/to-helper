package com.joshman.tests;

import org.junit.Assert;
import org.junit.Test;

import com.joshman.model.errors.RoundError;
import com.joshman.tests.utils.TestDataBuilder;
import com.joshman.validation.RoundValidation;

public class RoundValidationTest {

    private final TestDataBuilder dataBuilder = new TestDataBuilder();

    @Test
    public void testValidateRound() {

        RoundValidation.validateRound(dataBuilder.populateRound());

    }

    @Test
    public void testInvalidTableNumbers() {
        try {
            RoundValidation.validateRound(dataBuilder.populateInvalidRound());
            Assert.fail("Service should have thrown exception");
        } catch (AssertionError exception) {
            Assert.assertEquals(
                    RoundError.MINIMUM_TABLES_REQUIRED.getMessage(),
                    exception.getMessage());

        }
    }

    @Test
    public void testInvalidPlayersNumber() {
        try {
            RoundValidation.validateRound(dataBuilder.populateInvalidRound());
            Assert.fail("Service should have thrown exception");
        } catch (AssertionError exception) {
            Assert.assertEquals(
                    RoundError.MINIMUM_TABLES_REQUIRED.getMessage(),
                    exception.getMessage());
        }
    }

}
