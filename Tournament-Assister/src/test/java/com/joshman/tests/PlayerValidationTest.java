package com.joshman.tests;

import org.junit.Assert;
import org.junit.Test;

import com.joshman.model.Player;
import com.joshman.validation.PlayerValidation;

public class PlayerValidationTest {

	PlayerValidation playerValidation = new PlayerValidation();

	@Test
	public void testValidationPlayer() {

		Player player = new Player("Player", null);
		PlayerValidation.validatePlayer(player);

	}

	@Test
	public void testInvalidPlayer() {

		Player player = new Player("", null);
		try {
			PlayerValidation.validatePlayer(player);
			Assert.fail("Service was suppose to throw exception");
		} catch (AssertionError e) {

		}

	}


}
