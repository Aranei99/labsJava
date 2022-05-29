package com.aranei.var2;

public class Car {
    private Integer id;
    private String mark;
    private String model;
    private Integer year;
    private String color;
    private Integer price;
    private String regNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) throws Exception {
        checkString(mark);
        this.mark = mark;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) throws Exception {
        checkString(model);
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color)  throws Exception {
        checkString(color);
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber)   throws Exception {
        checkString(regNumber);
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }


    private void checkString(String value) throws Exception {
        if (value.equals("")) throw new Exception("Invalid value");
    }

}
