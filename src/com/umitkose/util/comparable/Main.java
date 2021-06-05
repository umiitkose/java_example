package com.umitkose.util.comparable;
/*
 * Created by umitkose
 * 5.06.2021 - 17:52
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //String ve Primitive type için sıralama..
        int[] arraySort = {1, 3, 6, 5, 7, 2, 9};
        Arrays.sort(arraySort);
        Arrays.stream(arraySort).forEach(i -> System.out.print(i + " "));

        System.out.println("\n----------------");

        List<String> listExample = new ArrayList<>();
        listExample.add("a");
        listExample.add("c");
        listExample.add("k");
        listExample.add("l");
        listExample.add("m");
        listExample.add("e");
        listExample.add("b");
        Collections.sort(listExample);
        listExample.forEach(a -> System.out.print(a + " "));

        System.out.println("\n----------------");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Zeynep", 0));
        personList.add(new Person("Beren", 1));
        personList.add(new Person("Nilay", 15));
        personList.add(new Person("Sümeyye", 3));
        personList.add(new Person("Buse", 7));
        personList.add(new Person("Nazlı", 4));

        Collections.sort(personList);
        personList.forEach(person -> System.out.println(person.id + " " + person.name ));
        System.out.println("------------");
        List<Author> authorList = new ArrayList<>();
        authorList.add(new Author("Ümit",28));
        authorList.add(new Author("Okan",18));
        authorList.add(new Author("Burak",12));
        authorList.add(new Author("Berke",42));
        Collections.sort(authorList);
        authorList.forEach(author -> System.out.println(author.age + " " + author.name));

    }
}
