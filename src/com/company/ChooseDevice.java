package com.company;

public class ChooseDevice {
    public static IPhone creation(SpecificDevices devices){
        switch (devices) {
            case IPhone7Plus:
                return new IPhone7Plus(DeviceColor.Gold,2,"Retina IPS LCD", true, true, true, 12, 8);
            case IPhone12ProMax:
                return new IPhone12ProMax(DeviceColor.Black,3, "Super Retina XDR OLED", true, true, true, 12, 12);
            case IPadAir2020:
                return new IPadAir2020(DeviceColor.Green,1,"Super Retina XDR OLED", true,true,true,12,12);
        }

        return new IPhone() {
            @Override
            public String backToHome() {
                return null;
            }
        };
    }

}
