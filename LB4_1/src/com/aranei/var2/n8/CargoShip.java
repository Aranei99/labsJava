package com.aranei.var2.n8;

public class CargoShip implements Ship{
    String portName;
    int carrying;

    @Override
    public void targetPort(String portName) {
        this.portName = portName;
    }
}
