package com.joshman.model.errors;

public enum RoundError {
	 INCORRECT_PLAYER_NUMBERS("Table requires 2 playesr"), MINIMUM_TABLES_REQUIRED("Round requires 2 or more tables");

	private final String value;

	private RoundError(String value) {
		this.value = value;
	}

	public String getMessage() {
		return value;
	}

}
