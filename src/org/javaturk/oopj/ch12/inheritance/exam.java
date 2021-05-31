package org.javaturk.oopj.ch12.inheritance;
/*
 * Created by umitkose
 * 10.05.2021 - 11:13
 */

public class exam {

    public static void main(String[] args) {
        C c=new C();

    }


}
class A {

    static int a=5;

    static {
        System.out.println("A statik blok başladı.");
    }
}

class B extends A{

    int a=5;

    {
        System.out.println("nesne blok oluşturuldu. ");
    }
}

class C extends B{
    public C(){
        System.out.println("C nesnesi oluşturuldu");
    }

}


