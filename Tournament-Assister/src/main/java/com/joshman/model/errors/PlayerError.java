package com.joshman.model.errors;

public enum PlayerError {
	MISSING_PLAYER_NAME("Player name is required");

	private final String value;

	PlayerError(String value) {
		this.value = value;
	}

	public String getMessage() {
		return value;
	}

}
