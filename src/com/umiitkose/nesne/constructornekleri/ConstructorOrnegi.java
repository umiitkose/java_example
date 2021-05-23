package com.umiitkose.nesne.constructornekleri;

public class ConstructorOrnegi {
    public void ConstructorOrnegi(){
        System.out.println("constructor'da void olmaz. Sınıf ismiyle aynı isimde metot varsa ve public dışında " +
                "geri dönüş bildiriyor ya da void ile tanımlanmışsa nesnenin davranışına ulaşılır.");
    }

    public ConstructorOrnegi() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        ConstructorOrnegi constructorOrnegi=new ConstructorOrnegi();
        System.out.println("****----****");
        constructorOrnegi.ConstructorOrnegi();
    }
}
