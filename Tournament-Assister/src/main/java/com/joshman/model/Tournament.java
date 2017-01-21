package com.joshman.model;

import java.util.List;
import java.util.Set;

public class Tournament {

	private Set<Player> players;
	private List<Round> rounds;

	public Tournament(Set<Player> set, List<Round> rounds) {
		this.players = set;
		this.rounds = rounds;
	}

	public Set<Player> getAttendees() {
		return players;
	}

	public void setAttendees(Set<Player> attendees) {
		this.players = attendees;
	}

	public List<Round> getRounds() {
		return rounds;
	}

	public void setRounds(List<Round> rounds) {
		this.rounds = rounds;
	}

}
