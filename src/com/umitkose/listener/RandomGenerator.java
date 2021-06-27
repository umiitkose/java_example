package com.umitkose.listener;
/*
 * Created by umitkose
 * 27.06.2021 - 17:14
 */

import java.util.Random;

public class RandomGenerator {
    private OnNumberGeneratedListener listener;

    public RandomGenerator() {
    }

    public OnNumberGeneratedListener getListener() {
        return listener;
    }

    public void setListener(OnNumberGeneratedListener listener) {
        this.listener = listener;
    }

    public void requestNumber() {
        Random r = new Random();
        listener.onNumberGenerated(r.nextInt());
    }
}
