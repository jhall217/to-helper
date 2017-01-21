package com.joshman.model;

import java.util.Set;

public class Table {

	private int tableNumber;
	private Set<Player> players;

	public Table(int tableNumber, Set<Player> players) {
		this.tableNumber = tableNumber;
		this.players = players;

	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

}
