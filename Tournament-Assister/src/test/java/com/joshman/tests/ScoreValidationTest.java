package com.joshman.tests;

import org.junit.Assert;
import org.junit.Test;

import com.joshman.model.Score;
import com.joshman.model.errors.ScoreError;
import com.joshman.validation.ScoreValidation;

public class ScoreValidationTest {

    private final ScoreValidation scoreValidation = new ScoreValidation();

    @Test
    public void testValidateScore() {

        Score score = new Score(Score.PrimaryScore.Win,
                Score.SecondaryScore.Win, 4);

        scoreValidation.validateScore(score);

    }

    @Test
    public void testValidateScoreMissingPrimary() {
        Score score = new Score(null, Score.SecondaryScore.Loss, 0);
        try {
            scoreValidation.validateScore(score);
            Assert.fail("Validataion did not throw an error");
        } catch (AssertionError error) {
            Assert.assertEquals(error.getMessage(),
                    ScoreError.PRIMARY_SCORE_REQUIRED.getMessage());
        }
    }

    @Test
    public void testValidateScoreMissingSecondary() {
        Score score = new Score(Score.PrimaryScore.Loss, null, 0);
        try {
            scoreValidation.validateScore(score);
            Assert.fail("Validataion did not throw an error");
        } catch (AssertionError error) {
            Assert.assertEquals(error.getMessage(),
                    ScoreError.SECONDARY_SCORE_REQUIRED.getMessage());
        }
    }


    @Test
    public void testValidateScoreTertiaryScoreExceeded() {
        Score score = new Score(Score.PrimaryScore.Loss, Score.SecondaryScore.Loss, 5);
        try {
            scoreValidation.validateScore(score);
            Assert.fail("Validataion did not throw an error");
        } catch (AssertionError error) {
            Assert.assertEquals(error.getMessage(),
                    ScoreError.TERTIARY_SCORE_GREATER_THAN_ALLOWED.getMessage());
        }
    }
}
