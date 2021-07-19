package com.company;

public class ChooseIPhone {
    public static IPhone phone(String iphoneType){
        if(iphoneType == "7Plus")
            return new IPhone7Plus(2,"Retina IPS LCD", true, true, true, 12, 8);
        else if (iphoneType == "12ProMax")
            return new IPhone12ProMax(3, "Super Retina XDR OLED", true, true, true, 12, 12);

        return new IPhone();
    }
}
