package com.umitkose.sayi;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {
    public static void main(String[] args) {

        BigDecimal bigInteger=new BigDecimal("12312412412412415124124213123123124123123123123.0");
        BigDecimal bigInteger1=new BigDecimal("121412421.0");

        System.out.println(bigInteger1.min(bigInteger));

        for (int i =1;i<9999999;i++){
           bigInteger = bigInteger.add(BigDecimal.valueOf(i));
        }

        System.out.println(bigInteger);

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the limit:");
        int limit = in.nextInt();
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 1; i < limit; i++) {
            sum = sum.add(BigInteger.valueOf(i));
        }

        System.out.println("Sum: " + sum);
//
//		System.out.println("*** But this may cause problems. ***");
        System.out.println("Sum as long: " + sum.longValue());
        System.out.println("Sum as int: " + sum.intValue());
//
//		System.out.println("Sum as long: " + sum.longValueExact());
//		System.out.println("Sum as int: " + sum.intValueExact());
    }
}
