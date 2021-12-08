package com.joshman.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {

    private PrimaryScore primaryScore;
    private SecondaryScore secondaryScore;
    private int tertiaryScore;

    public enum PrimaryScore {
        Win(10), Draw(5), Loss(2);

        private final int value;

        PrimaryScore(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    public enum SecondaryScore {
        Win(5), Draw(2), Loss(0);

        private final int value;

        SecondaryScore(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

}
