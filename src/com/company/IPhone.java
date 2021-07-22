package com.company;

public interface IPhone {

    default String backToHome () {
        return "Push the button";
    }

    default String charger () {
        return "Lightning charger";
    }
}
