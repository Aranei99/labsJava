package com.ara.var4;

public class Work {
    private String fromT;
    private String toT;
    private Car car;
    private WStatus wStatus = WStatus.STARTED;
    private Driver driver;

    public Work() {
    }

    public Work(String fromT, String toT, Car car, Driver driver) {
        this.fromT = fromT;
        this.toT = toT;
        this.car = car;
        this.driver = driver;
    }


    public String getFromT() {
        return fromT;
    }

    public void setFromT(String fromT) {
        this.fromT = fromT;
    }

    public String getToT() {
        return toT;
    }

    public void setToT(String toT) {
        this.toT = toT;
    }

    public WStatus getWStatus() {
        return wStatus;
    }

    public void setWStatus(WStatus wStatus) {
        this.wStatus = wStatus;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public enum WStatus{
        STARTED,
        FINISHED,
        BROKE
    }

    public void setLocations(String fromT, String toT ){
        this.fromT = fromT;
        this.toT = toT;
    }

    public void finishWork(WStatus wSta, Car.CStatus cSta){
        this.wStatus = wSta;
        this.car.setCarStatus(cSta);
    }

}
