package com.company;

public interface Tablet {

    void supportOf3DModeling ();

    default void supportOfKeypad () {
        System.out.println("Keypad is connected");
    };

    default void supportOfApplePencil () {
        System.out.println("Apple Pencil is connected");
    };
}
