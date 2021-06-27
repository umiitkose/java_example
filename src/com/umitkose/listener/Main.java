package com.umitkose.listener;
/*
 * Created by umitkose
 * 27.06.2021 - 17:17
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator randomGenerator = new RandomGenerator();
        randomGenerator.setListener(new OnNumberGeneratedListener() {
            @Override
            public void onNumberGenerated(int number) {
                System.out.println(number);
            }
        });



        while (true) {
            scanner.nextLine();

            randomGenerator.requestNumber();
        }



    }
}
