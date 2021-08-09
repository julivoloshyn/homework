package com.company;

public class IPhone12ProMax extends GeneralCharacteristics implements IPhone{

    public IPhone12ProMax(DeviceColor color, int numOfCameras, String displayType, boolean bluetooth, boolean wifi,
                       boolean airdrop, int frontCameraMp, int mainCameraMp){
        this.color = color;
        this.numOfCameras = numOfCameras;
        this.displayType = displayType;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.airdrop = airdrop;
        this.frontCameraMp = frontCameraMp;
        this.mainCameraMp = mainCameraMp;
    }

    @Override
    public String backToHome() {
        return "Make a swipe";
    }

    @Override
    public String charger() {
        return IPhone.super.charger();
    }

}
