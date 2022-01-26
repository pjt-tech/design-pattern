package com.company.design;

import com.company.design.adapter.*;

public class Main {

    public static void main(String[] args) {

        /* 싱글톤 패턴 테스트
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println(aClient.equals(bClient));*/
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

    }

    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
