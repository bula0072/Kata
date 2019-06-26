package com.kata.FindTheParityOutlier;

class MySolution {
    int find(int[] integers) {
        int numberOfOddNumbers = 0;
        int numberOfEvenNumbers = 0;
        int lastOddNumber = 0;
        int lastEvenNumber = 0;

        for (int integer : integers) {
            if (integer % 2 == 0) {
                lastEvenNumber = integer;
                numberOfEvenNumbers++;
            } else {
                lastOddNumber = integer;
                numberOfOddNumbers++;
            }
        }
        if (numberOfEvenNumbers == 1 && numberOfOddNumbers != 1)
            return lastEvenNumber;
        else
            return lastOddNumber;
    }
}
