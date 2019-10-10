package com.kata.WellOfIdeasEasyVersion;

public class MySolution {
    public static String well(String[] x) {
        int goodIdea = 0;
        for (String a :
                x) {
            if(a.equals("good")) goodIdea++;
        }
        switch (goodIdea)
        {
            case 0:
                return "Fail!";
            case 1:
            case 2:
                return "Publish!";
            default:
                return "I smell a series!";
        }
    }
}
