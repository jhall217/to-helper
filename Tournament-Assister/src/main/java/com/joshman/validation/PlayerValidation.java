package com.joshman.validation;

import org.junit.Assert;

import com.joshman.model.Player;
import com.joshman.model.errors.PlayerError;

public class PlayerValidation {

	public static void validatePlayer(Player player) {

		Assert.assertNotNull(PlayerError.MISSING_PLAYER_NAME.getMessage(),
				player.getName());
		Assert.assertFalse(PlayerError.MISSING_PLAYER_NAME.getMessage(), player
				.getName().isEmpty());
	}
}
