package com.umitkose.system;

import java.io.File;

public class SystemKontrolleri {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home") + File.separatorChar + "serviceList." + "test" + ".json");

        //2 metot arası çalışma farkı
        long start=System.currentTimeMillis();
        test();
        long end=System.currentTimeMillis();
        System.out.print(end - start + " mili sn");

    }
    private static void test(){

    }
}
