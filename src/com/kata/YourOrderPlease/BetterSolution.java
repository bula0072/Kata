package com.kata.YourOrderPlease;

import java.util.Arrays;
import java.util.Comparator;

class BetterSolution {
    String order(String words) {
        //noinspection OptionalGetWithoutIsPresent
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing($ -> Integer.valueOf($.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
}
