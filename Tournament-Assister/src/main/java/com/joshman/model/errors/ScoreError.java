package com.joshman.model.errors;

public enum ScoreError {
	PRIMARY_SCORE_REQUIRED("Primary score is required"), SECONDARY_SCORE_REQUIRED(
			"Secondary score is required"), TERTIARY_SCORE_REQUIRED(
			"Tertiary score is required"), TERTIARY_SCORE_GREATER_THAN_ALLOWED("Tertiary Score cannot exceed 4");

	private final String value;

	private ScoreError(String value) {
		this.value = value;
	}

	public String getMessage() {
		return value;
	}

}
