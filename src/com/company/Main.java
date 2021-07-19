package com.company;

public class Main {

    public static void main(String[] args) {
        IPhone iph1 = ChooseIPhone.phone("7Plus");
        IPhone iph2 = ChooseIPhone.phone("12ProMax");

        System.out.println("Back to home: " + iph1.backToHome());
        System.out.println("Back to home: " + iph2.backToHome());
    }
}
