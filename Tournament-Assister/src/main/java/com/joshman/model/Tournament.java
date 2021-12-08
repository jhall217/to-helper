package com.joshman.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tournament {

	private Set<Player> players;
	private List<Round> rounds;

}
