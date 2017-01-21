package com.joshman.model.errors;

public enum TournamentError {
	INVALID_ROUNDS("Tournament requires more than 2 rounds"), TOURNAMENT_NULL("Tournament cannot be null");

	private final String value;

	private TournamentError(String value) {
		this.value = value;
	}

	public String getMessage() {
		return value;
	}

}