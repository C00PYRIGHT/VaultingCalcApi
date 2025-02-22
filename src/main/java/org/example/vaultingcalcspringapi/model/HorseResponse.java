package org.example.vaultingcalcspringapi.model;

public class HorseResponse {
    private HorseInput input;
    private double a1;

    private double a2;
    private double a3;
    private double total;

    public HorseInput getInput() {
        return input;
    }

    public void setInput(HorseInput input) {
        this.input = input;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public HorseResponse(HorseInput input, double a1, double a2, double a3, double total) {
        this.input = input;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.total = total;
    }
}
