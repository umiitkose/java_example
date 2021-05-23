package com.umiitkose.casting.casterror;
/*
 * Created by umitkose
 * 22.05.2021 - 19:32
 */


public class Main {
    public static void main(String[] args) {
        CastingError cast = new CastingError();
        CastErrorParent castParent = new CastErrorParent();
        CastingErrorSub castSub = new CastingErrorSub();
        CastErrorParent castDuzeltme = new CastingErrorSub();


        castSub.doAnything();
        cast.doAnything();
        castParent.doAnything();


        castDuzeltme = castParent;
        castDuzeltme.benParent();
        castDuzeltme.benParentTest();

        castSub = (CastingErrorSub) castParent;
        castSub.doAnything();
        castSub.benParentTest();

    }
}
