package com.company;

public class Main {

    public static void main(String[] args) {
        IPhone iph1 = new IPhone12ProMax(2, "IPS", true, true, true, 12, 8);
        IPhone iph2 = new IPhone7Plus(3, "XDR", true, true, true, 12, 12);
        Tablet ipd = new IPadAir2020(1, "XDR", true, true, true, 12, 7);

        iph1.backToHome();
        iph1.charger();

        iph2.backToHome();
        iph2.charger();

        IPhone ipad = getChosenDevise();
        ipd.supportOf3DModeling();
        ipd.supportOfApplePencil();
        ipd.supportOfKeypad();
    }

    public static IPhone getChosenDevise() {
        ChooseDevice dev = new ChooseDevice();
        return dev.creation("Iphone12ProMax");
    }
}
