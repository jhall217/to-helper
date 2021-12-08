package com.joshman.tests;

import com.joshman.model.Player;
import com.joshman.validation.PlayerValidation;
import org.junit.Test;

public class PlayerValidationTest {

    @Test
    public void testValidationPlayer() {

        Player player = new Player("Player", "Name");
        PlayerValidation.validatePlayer(player);

    }

    @Test(expected = AssertionError.class)
    public void testInvalidPlayer() {

        Player player = new Player("", null);
        PlayerValidation.validatePlayer(player);

    }


}
