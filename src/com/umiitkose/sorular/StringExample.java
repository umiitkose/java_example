package com.umiitkose.sorular;
/*
 * Created by umitkose
 * 14.05.2021 - 21:03
 */

import java.util.HashMap;

public class StringExample {

    public static void main(String[] args) {
        String test = "Java Exercise";

        //karakterin indexini veren ve o index'teki karakteri veren örnek
      /*  System.out.println(test + " Örneğinin 0. index 'i => " + test.charAt(0));
        System.out.println(test + " Örneğinin J harf 'in index'i => " + test.indexOf('J'));
*/
        //özel bir karakter temizleme
        StringExample stringExample = new StringExample();
        System.out.println(stringExample.removeSpecifiedChracater("abcdefabcdeabcdaaa"));

        String findSecondMostCharacter="ümiitkoseee";
        System.out.println(stringExample.secondCommon(findSecondMostCharacter));
    }

    private String removeSpecifiedChracater(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        char specifiedCharacter = 'a';
        if (s.equals("") || s.isEmpty()) {
            System.out.println("Boş ya da hatalı bir değer girdiniz..");
            return "";
        } else {
            char[] characters = s.toCharArray();
            for (char character : characters) {
                if (character != specifiedCharacter) {
                    stringBuffer.append(character);
                }
            }
        }

        return stringBuffer.toString();
    }

    /*
    Example :
    The given string is: successes
    The second most frequent char in the string is: c*/
    public Character secondCommon(String str) {
        Character ans = null;
        int first = 0, second = 0;
        Character firstChar = null,secondChar = null;
        HashMap<Character,Integer> counter = new HashMap<>();
        for(char c: str.toCharArray())
        {
            if(!counter.containsKey(c))
            {
                counter.put(c,1);
            }
            else
            {
                counter.put(c,counter.get(c) + 1);
            }
        }
        System.out.println(counter);
        for (char c: counter.keySet())
        {
            if(counter.get(c) > first)
            {

                second = first;
                secondChar = firstChar;
                firstChar = c;

                first = counter.get(c);
            }
            else
            if(counter.get(c) > second && counter.get(c) < first)
            {
                second = counter.get(c);

                secondChar = c;
            }
        }
        return secondChar;
    }

}
