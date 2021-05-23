package com.umiitkose.casting.casterror;
/*
 * Created by umitkose
 * 22.05.2021 - 19:32
 */

public class CastingError implements ICastParent{

    @Override
    public void doAnything() {
        System.out.println("Bişi yaptım.");
    }


    public void benError(){
        System.out.println("Error");
    }
}
