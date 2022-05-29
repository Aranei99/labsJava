package com.aranei.var2.n8;

public class Tanker extends CargoShip{

    String type;

    public Tanker(String type, int carrying, String portName) {
        this.type = type;
        this.carrying = carrying;
        this.portName = portName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void pushFuel(){
        this.type = "empty";
    }

}
