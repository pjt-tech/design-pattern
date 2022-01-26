package com.company.design.adapter;

public class SocketAdapter implements Electronic110V{

    private Electronic220V electronic220V;

    //adapter를 통해 맞지않던것을 맞춰줌
    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
