package com.joshman.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Round {

	private Long id;
	private List<Table> tables;
	private int roundNumber;

}
