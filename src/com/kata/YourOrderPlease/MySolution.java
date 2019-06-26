package com.kata.YourOrderPlease;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MySolution {
    String order(String words) {
        String[] list = words.split(" ");
        Pattern pattern = Pattern.compile("[0-9]");
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i; j < list.length; j++) {
                Matcher m1 = pattern.matcher(list[i]);
                Matcher m2 = pattern.matcher(list[j]);
                if ((m1.find() && m2.find()) && (Integer.parseInt(m1.group()) > Integer.parseInt(m2.group()))) {
                        String tmp = list[i];
                        list[i] = list[j];
                        list[j] = tmp;
                }
            }
        }
        return String.join(" ", list);
    }
}
