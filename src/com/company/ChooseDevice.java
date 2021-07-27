package com.company;

public class ChooseDevice {
    public static IPhone creation(String device){
        if (device == "IPhone7Plus")
            return new IPhone7Plus(2,"Retina IPS LCD", true, true, true, 12, 8);
        else if (device == "IPhone12ProMax")
            return new IPhone12ProMax(3, "Super Retina XDR OLED", true, true, true, 12, 12);
        else if (device == "IPadAir2020")
                    return new IPadAir2020(1,"Super Retina XDR OLED", true,true,true,12,12);

        return new IPhone() {
            @Override
            public String backToHome() {
                return null;
            }
        };
    }


}
