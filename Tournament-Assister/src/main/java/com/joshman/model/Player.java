package com.joshman.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	private String itsPin;
	private String name;

	public Player(String name, String itsPin) {
		this.name = name;
		this.itsPin = itsPin;
	}

	protected Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItsPin() {
		return itsPin;
	}

	public void setItsPin(String itsPin) {
		this.itsPin = itsPin;
	}

}
