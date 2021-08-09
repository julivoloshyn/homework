package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        IPhone iph1 = new IPhone12ProMax(DeviceColor.Gold, 2, "IPS", true, true, true, 12, 8);
        IPhone iph2 = new IPhone7Plus(DeviceColor.Black,3, "XDR", true, true, true, 12, 12);
        Tablet ipd = new IPadAir2020(DeviceColor.Green,1, "XDR", true, true, true, 12, 7);

        iph1.backToHome();
        iph1.charger();

        iph2.backToHome();
        iph2.charger();

        IPhone ipad = getChosenDevise(SpecificDevices.IPhone12ProMax);
        ipd.supportOf3DModeling();
        ipd.supportOfApplePencil();
        ipd.supportOfKeypad();


        Set<DeviceColor> iph12pm = new HashSet<>();
        iph12pm.add(DeviceColor.Gold);
        iph12pm.add(DeviceColor.PacificBlue);
        iph12pm.add(DeviceColor.Silver);
        iph12pm.add(DeviceColor.Black);

        Set<DeviceColor> iph7pl = new HashSet<>();
        iph7pl.add(DeviceColor.Black);
        iph7pl.add(DeviceColor.SpaceGray);
        iph7pl.add(DeviceColor.Gold);
        iph7pl.add(DeviceColor.Red);
        iph7pl.add(DeviceColor.RoseGold);
        iph7pl.add(DeviceColor.Silver);

        Set<DeviceColor> ipd20 = new HashSet<>();
        ipd20.add(DeviceColor.SpaceGray);
        ipd20.add(DeviceColor.Green);
        ipd20.add(DeviceColor.Blue);
        ipd20.add(DeviceColor.Silver);
        ipd20.add(DeviceColor.RoseGold);

        Map<SpecificDevices, HashSet<DeviceColor>> chooseColor = new HashMap<>();
        chooseColor.put(SpecificDevices.IPhone7Plus, (HashSet<DeviceColor>) iph12pm);
        chooseColor.put(SpecificDevices.IPhone7Plus, (HashSet<DeviceColor>) iph7pl);
        chooseColor.put(SpecificDevices.IPadAir2020, (HashSet<DeviceColor>) ipd20);
    }

    public static IPhone getChosenDevise(SpecificDevices devices) {
        ChooseDevice dev = new ChooseDevice();
        return dev.creation(SpecificDevices.IPhone12ProMax);
    }
}
