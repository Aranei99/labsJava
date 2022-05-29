package com.ara.var42;

public class Client {
    private String fio;
    private BlackStatus blackStatus = BlackStatus.WHITE;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public BlackStatus getDriverStatus() {
        return blackStatus;
    }

    public void setBlackStatus(BlackStatus driverStatus) {
        this.blackStatus = driverStatus;
    }

    public enum BlackStatus {
        WHITE,
        BLACK
    }

    private void payFor(Zakaz z){
        z.setWStatus(Zakaz.WStatus.PAY);
    }
}
