package com.kata.PowerOfTwo;

class PowerOfTwo {
    static boolean powerOfTwo(int number){
        return !Integer.toString(number, 2).substring(1).contains("1");
    }
}
