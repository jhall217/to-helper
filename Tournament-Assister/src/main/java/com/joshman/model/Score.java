package com.joshman.model;

public class Score {

	private PrimaryScore primaryScore;
	private SecondaryScore secondaryScore;
	private int tertiaryScore;

	public Score(PrimaryScore primary, SecondaryScore secondary, int tertiary) {
		this.primaryScore = primary;
		this.secondaryScore = secondary;
		this.tertiaryScore = tertiary;
	}

	public int getTertiaryScore() {
		return tertiaryScore;
	}

	public void setTertiaryScore(int tertiaryScore) {
		this.tertiaryScore = tertiaryScore;
	}

	public void setPrimaryScore(PrimaryScore primaryScore) {
		this.primaryScore = primaryScore;
	}

	public PrimaryScore getPrimaryScore() {
		return primaryScore;
	}

	public void setSecondary(SecondaryScore secondaryScore) {
		this.secondaryScore = secondaryScore;
	}

	public SecondaryScore getSecondaryScore() {
		return secondaryScore;
	}

	public static enum PrimaryScore {
		Win(10), Draw(5), Loss(2);

		private final int value;

		private PrimaryScore(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

	}

	public static enum SecondaryScore {
		Win(5), Draw(2), Loss(0);

		private final int value;

		private SecondaryScore(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

	}

}
