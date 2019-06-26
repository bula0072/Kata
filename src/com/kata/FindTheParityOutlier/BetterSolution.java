package com.kata.FindTheParityOutlier;

import java.util.Arrays;

class BetterSolution {
    int find(int[] integers) {
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        //noinspection OptionalGetWithoutIsPresent
        return Arrays.stream(integers).parallel()
                .filter($ -> Math.abs($) % 2 == mod).findFirst().getAsInt();
    }
}
