package com.joshman.tests.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.joshman.model.Player;
import com.joshman.model.Round;
import com.joshman.model.Table;
import com.joshman.model.Tournament;

public class TestDataBuilder {

	private static String playername = UUID.randomUUID().toString();

	public Round populateRound() {

		return new Round(populateTables(), 1);

	}

	public List<Table> populateTables() {

		Table table1 = populdateTable();
		Table table2 = populdateTable();

		List<Table> tables = new ArrayList<Table>();
		tables.add(table1);
		tables.add(table2);

		return tables;
	}

	public Table populdateTable() {
		return new Table(1, populdatePlayers());
	}

	public Set<Player> populdatePlayers() {

		Set<Player> players = new HashSet<Player>();
		players.add(populdatePlayer());
		players.add(populdatePlayer());

		return players;
	}

	public Player populdatePlayer() {
		return new Player(playername, String.valueOf(UUID.randomUUID()));
	}

	public Round populateInvalidRound() {

		List<Table> tables = new ArrayList<Table>();
		Set<Player> players = new HashSet<Player>();

		Player player = new Player(playername, null);
		players.add(player);
		players.add(player);
		players.add(player);
		Table table = new Table(0, players);
		tables.add(table);

		return new Round(tables, 0);

	}

	public Tournament invalidTournament() {
		List<Round> rounds = new ArrayList<Round>();
		rounds.add(populateRound());
		rounds.add(populateRound());
		return new Tournament(populdatePlayers(), rounds);
	}

	public Tournament populateTournament() {
		List<Round> rounds = new ArrayList<Round>();
		rounds.add(populateRound());
		rounds.add(populateRound());
		rounds.add(populateRound());
		return new Tournament(populdatePlayers(), rounds);
	}
}
