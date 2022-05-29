package com.ara.var42;

public class Admin {
    public void checkSta(Zakaz zakaz){
        Zakaz.WStatus tmp = zakaz.getWStatus();
    }

    public void addProduct(String name, int price, int amount ){
        new Product(name, price, amount);
    }

    public void setBlackSta(Client client){
        client.setBlackStatus(Client.BlackStatus.BLACK);
    }
}
