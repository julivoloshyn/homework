package com.company;

public class IPadAir2020 extends GeneralCharacteristics implements Tablet, IPhone {

    public IPadAir2020(int numOfCameras, String displayType, boolean bluetooth, boolean wifi,
                       boolean airdrop, int frontCameraMp, int mainCameraMp){
        this.numOfCameras = numOfCameras;
        this.displayType = displayType;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.airdrop = airdrop;
        this.frontCameraMp = frontCameraMp;
        this.mainCameraMp = mainCameraMp;
    }


    @Override
    public void supportOf3DModeling() {

    }

    @Override
    public String backToHome() {
        return "Make a swipe";
    }

    @Override
    public String charger() {
        return "Type C charger";
    }
}
