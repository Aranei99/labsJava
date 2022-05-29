package com.aranei;

import java.util.ArrayList;

public class KvadrUrav {
    private double a;
    private double b;
    private double c;
    private double d;
    private ArrayList<Double> Xes;

    public KvadrUrav() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public KvadrUrav(double A, double B, double C) {
        this.setA(A);
        this.setB(B);
        this.setC(C);
        this.calcD();
    }

    public void setA(double A) {
        this.a = A;
    }

    public void setB(double B) {
        this.b = B;
    }

    public void setC(double C) {
        this.c = C;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getEx() {
        return this.Xes.get(0);
    }

    public double getX1() {
        return this.Xes.get(1);
    }

    public double getX2() {
        return this.Xes.get(2);
    }

    public double getXs() {
        return this.Xes.get(3);
    }

    public void calcD() {
        this.d = this.getB() * this.getB() - 4 * this.getA() * this.getC();
    }

    public void calcXes() {
        if (this.getD() >= 0) {
            if (this.getD() == 0) {
                this.Xes.set(0, - this.getB() / (2 * this.getA())); // Экстремум
                this.Xes.set(1, - this.getB() / (2 * this.getA())); // Корень
                this.Xes.set(3, 1.0);
            }
            else {
                this.Xes.set(0, - this.getB() / (2 * this.getA())); // Экстремум
                this.Xes.set(1, - this.getB() - Math.sqrt(this.getD()) / (2 * this.getA())); // Корень 1
                this.Xes.set(2, - this.getB() + Math.sqrt(this.getD()) / (2 * this.getA())); // Корень 2
                this.Xes.set(3, 2.0);
            }
        }
    }

    public void fallRaise() {
        if (this.getA() > 0) {
            System.out.println("Fall to " + this.getEx());
            System.out.println("Raise from " + this.getEx());
            }
        else {
            System.out.println("Raise to " + this.getEx());
            System.out.println("Fall from " + this.getEx());
            }
    }

    public ArrayList<Double> vectorComplex(ArrayList<KvadrUrav> array)  {
        ArrayList<Double> result = new ArrayList<>();
        result.set(0, array.get(0).getX1());
        result.set(1, array.get(0).getX1());
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getXs() == 2.0) {
                if (result.get(0) > array.get(i).getX2()) result.set(0, array.get(i).getX2());
                if (result.get(1) < array.get(i).getX2()) result.set(1, array.get(i).getX2());
            }
            if (result.get(0) > array.get(i).getX1()) result.set(0, array.get(i).getX1());
            if (result.get(1) < array.get(i).getX1()) result.set(1, array.get(i).getX1());
        }
        return result;
    }

}

