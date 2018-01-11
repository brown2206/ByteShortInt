package com.angelobrown;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 10;
        short myShortValue = 20;
        int myMaxValue = 50;

        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myMaxValue);
        short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myMaxValue));
        System.out.println("longTotal = " + myLongValue);
        System.out.println("shortTotal = " + shortTotal);
    }
}
