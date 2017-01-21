package com.joshman.validation;

import org.junit.Assert;

import com.joshman.model.Score;
import com.joshman.model.Score.PrimaryScore;
import com.joshman.model.Score.SecondaryScore;
import com.joshman.model.errors.ScoreError;

public class ScoreValidation {

	public void validateScore(Score score) {

		validatePrimary(score.getPrimaryScore());
		validateSecondary(score.getSecondaryScore());
		validateTertiaryScore(score.getTertiaryScore());

	}

	private void validatePrimary(PrimaryScore primaryScore) {
		Assert.assertNotNull(ScoreError.PRIMARY_SCORE_REQUIRED.getMessage(), primaryScore);
	}

	private void validateSecondary(SecondaryScore secondaryScore) {
		Assert.assertNotNull(ScoreError.SECONDARY_SCORE_REQUIRED.getMessage(), secondaryScore);
	}

	private void validateTertiaryScore(int tertiaryScore) {
		Assert.assertNotNull(ScoreError.TERTIARY_SCORE_REQUIRED.getMessage(),tertiaryScore);
		Assert.assertTrue(ScoreError.TERTIARY_SCORE_GREATER_THAN_ALLOWED.getMessage(),tertiaryScore < 5);
	}

}
