package com.umitkose.casting.casterror;
/*
 * Created by umitkose
 * 22.05.2021 - 19:33
 */

public class CastErrorParent implements ICastParent{

    @Override
    public void doAnything() {
        System.out.println("CastError'daki Parent bişi yaptı.");
    }

    public void benParent(){
        System.out.println("Parentim");
    }


    public void benParentTest(){
        System.out.println("Parentim");
    }
}
