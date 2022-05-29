package com.aranei;

import java.util.ArrayList;

public class ComplexNum {
    private double real;
    private double imaginary;

    public ComplexNum() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNum(double R, double I) {
        this.setReal(R);
        this.setImaginary(I);
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void copyComplex(ComplexNum Complex) {
        this.setReal(Complex.getReal());
        this.setImaginary(Complex.getImaginary());
    }

    public void plusComplex(ComplexNum Complex) {
        this.setReal(Complex.getReal() + this.getReal());
        this.setImaginary(Complex.getImaginary() + this.getImaginary());
    }

    public void minusComplex(ComplexNum Complex) {
        this.setReal(Complex.getReal() - this.getReal());
        this.setImaginary(Complex.getImaginary() - this.getImaginary());
    }

    public void mulComplex(ComplexNum Complex) {
        this.setReal(Complex.getReal() * this.getReal() - this.getImaginary() * Complex.getImaginary());
        this.setImaginary(Complex.getImaginary() * this.getReal() + this.getImaginary() * Complex.getReal());
    }

    public void divComplex(ComplexNum Complex) {
        double temp = Complex.getReal() * Complex.getReal() + Complex.getImaginary() * Complex.getImaginary();
        this.setReal(Complex.getReal() * this.getReal() + this.getImaginary() * Complex.getImaginary() / temp);
        this.setImaginary(Complex.getReal() * this.getImaginary() - this.getReal() * Complex.getImaginary()  / temp);
    }

    public ArrayList<ComplexNum> vectorComplex(ArrayList<ComplexNum> vector1, ArrayList<ComplexNum> vector2)  {
        ArrayList<ComplexNum> result = new ArrayList<>();
        ComplexNum tempC = new ComplexNum();
        for (int i = 0; i < vector1.size(); i++) {
            tempC.setReal(vector1.get(i).getReal() + vector2.get(i).getReal());
            tempC.setImaginary(vector1.get(i).getImaginary() + vector2.get(i).getImaginary());
            result.set(i, tempC);
        }
        return result;
    }
}
