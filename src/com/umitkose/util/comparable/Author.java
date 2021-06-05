package com.umitkose.util.comparable;
/*
 * Created by umitkose
 * 5.06.2021 - 18:10
 */

public class Author implements Comparable<Author> {

    String name;
    int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Author o) {
        return this.age > o.age ? 1 : this.age < o.age ? -1 : 0;
    }
}
