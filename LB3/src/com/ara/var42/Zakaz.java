package com.ara.var42;

public class Zakaz {
    private Product product;
    private WStatus wStatus = WStatus.NOT_PAY;
    private Client client;

    public WStatus getWStatus() {
        return wStatus;
    }

    public void setWStatus(WStatus wStatus) {
        this.wStatus = wStatus;
    }

    public Product getCar() {
        return product;
    }

    public void setCar(Product product) {
        this.product = product;
    }

    public Client getDriver() {
        return client;
    }

    public void setDriver(Client client) {
        this.client = client;
    }

    public enum WStatus{
        PAY,
        NOT_PAY
    }

    public void addProduct(Product product, int amount){
        product.setAmount(amount);
    }


}
