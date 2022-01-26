package com.company.design.singleton;

public class SocketClient {

    //싱글톤 패턴 객체가 애플리케이션에서 하나만 존재해야 할때.
    private static final SocketClient socketClient = new SocketClient();

    private SocketClient() {
    }

    public static SocketClient getInstance() {

        /*if(socketClient == null) {
            socketClient = new SocketClient();
        }*/
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
