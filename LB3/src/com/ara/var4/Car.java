package com.ara.var4;

public class Car {
    private String id;
    private CStatus carStatus = CStatus.OK;

    public CStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CStatus carStatus) {
        this.carStatus = carStatus;
    }

    public enum CStatus{
        OK,
        BROKE,
        TO_FIX
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
