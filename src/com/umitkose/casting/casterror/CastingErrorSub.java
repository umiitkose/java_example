package com.umitkose.casting.casterror;
/*
 * Created by umitkose
 * 22.05.2021 - 19:35
 */

public class CastingErrorSub  extends CastErrorParent{
    @Override
    public void doAnything() {
        System.out.println("sub bişi yaptı.");
    }

    @Override
    public void benParent() {
        super.benParent();
    }
}
