package com.kata.Meeting;

import java.util.ArrayList;

class Meeting {
    static String meeting(String s) {
        String[] stringArray = s.split(";");
        ArrayList<Person> list = new ArrayList<>();
        for (String array : stringArray) {
            String[] tmp = array.split(":");
            list.add(new Person(tmp[0].toUpperCase(), tmp[1].toUpperCase()));
        }
        list.sort(Person.compareBySurname);
        StringBuilder returned = new StringBuilder();
        for (Person l1 :
                list) {
            returned.append(l1.toString());
        }
        return returned.toString();
    }


}
