package com.joshman.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Round {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Round(List<Table> tables, int roundNumber) {
		this.tables = tables;
		this.roundNumber = roundNumber;
	}

	protected Round() {
	}

	private List<Table> tables;
	private int roundNumber;

	public List<Table> getTables() {
		return tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

	public int getNumber() {
		return roundNumber;
	}

	public void setNumber(int number) {
		this.roundNumber = number;
	}

}
