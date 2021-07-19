package com.company;

public class IPhone7Plus extends IPhone{
    public IPhone7Plus(int numOfCameras, String displayType, boolean bluetooth, boolean wifi,
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
    String backToHome() {
        return super.backToHome();
    }
}
