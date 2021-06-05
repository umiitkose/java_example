package com.umitkose.util.comparable;
/*
 * Created by umitkose
 * 5.06.2021 - 18:10
 */

public class Person implements Comparable<Person> {

    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Person o) {
        int last = this.name.compareTo(o.name);
        return last == 0 ? this.name.compareTo(o.name) : last;
    }
}
