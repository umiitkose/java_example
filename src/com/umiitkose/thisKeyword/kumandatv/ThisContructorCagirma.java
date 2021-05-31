package com.umiitkose.thisKeyword.kumandatv;
/*
 * Created by umitkose
 * 30.05.2021 - 12:41
 */

public class ThisContructorCagirma {

    int a ;
    int b ;

    public ThisContructorCagirma(int a) {
        this.a = a;
    }

    public ThisContructorCagirma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ThisContructorCagirma(){
        this(1,3);
    }

}
