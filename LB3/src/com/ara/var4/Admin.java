package com.ara.var4;

public class Admin {
    public void createWork(String fromT, String toT, Car car, Driver driver){
        new Work( fromT,  toT,  car,  driver);
    }

    public void changeDriverSta(Driver driver){
        driver.setDriverStatus(Driver.DStatus.FREE);
    }
}
