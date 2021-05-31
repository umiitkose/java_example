package org.javaturk.oopj.ch09.statik;

public class StatikOrnek {

    static int OLUSTURULAN_NESNE=0;

    public static void main(String[] args) {
        CreateObject createObject=new CreateObject();
        CreateObject createObject1=new CreateObject();
        CreateObject createObject2=new CreateObject();
        CreateObject createObject3=new CreateObject();
        CreateObject createObject4=new CreateObject();


        System.out.println(OLUSTURULAN_NESNE);
    }
}
