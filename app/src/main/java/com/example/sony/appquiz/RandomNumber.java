package com.example.sony.appquiz;

import java.util.Random;
//Class used to generate Random Number in Range
public class RandomNumber {


    public  int randomNoInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max<min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }





}
