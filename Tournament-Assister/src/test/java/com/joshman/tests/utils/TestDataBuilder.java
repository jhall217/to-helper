package com.joshman.tests.utils;

import java.util.*;

import com.joshman.model.Player;
import com.joshman.model.Round;
import com.joshman.model.Table;
import com.joshman.model.Tournament;

public class TestDataBuilder {

	private static final String playerName = UUID.randomUUID().toString();

	public Round populateRound() {

		return new Round(1L,populateTables(), 1);

	}

	public List<Table> populateTables() {

		Table table1 = populateTable();
		Table table2 = populateTable();

		List<Table> tables = new ArrayList<>();
		tables.add(table1);
		tables.add(table2);

		return tables;
	}

	public Table populateTable() {
		return new Table(1, populatePlayers());
	}

	public Set<Player> populatePlayers() {

		Set<Player> players = new HashSet<>();
		players.add(populatePlayer());
		players.add(populatePlayer());

		return players;
	}

	public Player populatePlayer() {
		return new Player(playerName, String.valueOf(UUID.randomUUID()));
	}

	public Round populateInvalidRound() {

		List<Table> tables = new ArrayList<>();

		Player player = new Player(playerName, null);

		Table table = new Table(0, new HashSet<>(Arrays.asList(player, player, player)));
		tables.add(table);

		return new Round(1L, tables, 0);

	}

	public Tournament invalidTournament() {
		List<Round> rounds = new ArrayList<>();
		rounds.add(populateRound());
		rounds.add(populateRound());
		return new Tournament(populatePlayers(), rounds);
	}

	public Tournament populateTournament() {
		List<Round> rounds = new ArrayList<>();
		rounds.add(populateRound());
		rounds.add(populateRound());
		rounds.add(populateRound());
		return new Tournament(populatePlayers(), rounds);
	}
}
