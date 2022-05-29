package com.ara.var4;

public class Driver {
    private String fio;
    private DStatus driverStatus;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public DStatus getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(DStatus driverStatus) {
        this.driverStatus = driverStatus;
    }

    public enum DStatus {
        FREE,
        READY,
        WORK
    }

    public void setFix(Car car){
        car.setCarStatus(Car.CStatus.TO_FIX);
    }
}
