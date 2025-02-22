package org.example.vaultingcalcspringapi.model;

public class TechResponse {
    private int rcount;
    private int dcount;
    private int mcount;
    private int ecount;
    private int deductions;
    private int sumofexercises;
    private double falldeductions;
    private double total;
    private double difficultytotal;
    private double performancetotal;
    public TechResponse(int ecount, int rcount, int mcount, int dcount, int deductions, int sumofexercises, double falldeductions) {
        this.ecount = ecount;
        this.rcount = rcount;
        this.mcount = mcount;
        this.dcount = dcount;
        this.deductions = deductions;
        this.sumofexercises = sumofexercises;
        this.falldeductions = falldeductions;
        this.total = 0;
        this.difficultytotal = 0;
        this.performancetotal = 0;
    }

    public TechResponse(int ecount, int rcount, int mcount, int dcount, int deductions, int sumofexercises, double falldeductions, double total, double difficultytotal, double performancetotal) {
        this.ecount = ecount;
        this.rcount = rcount;
        this.mcount = mcount;
        this.dcount = dcount;
        this.deductions = deductions;
        this.sumofexercises = sumofexercises;

        this.falldeductions = falldeductions;
        this.total = total;
        this.difficultytotal = difficultytotal;
        this.performancetotal = performancetotal;
    }

    // getters és setters
    public int getEcount() {
        return ecount;
    }

    public void setEcount(int ecount) {
        this.ecount = ecount;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public int getMcount() {
        return mcount;
    }

    public void setMcount(int mcount) {
        this.mcount = mcount;
    }

    public int getDcount() {
        return dcount;
    }

    public void setDcount(int dcount) {
        this.dcount = dcount;
    }

    public int getDeductions() {
        return deductions;
    }

    public void setDeductions(int deductions) {
        this.deductions = deductions;
    }

    public double getFalldeductions() {
        return falldeductions;
    }

    public void setFalldeductions(double falldeductions) {
        this.falldeductions = falldeductions;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDifficultytotal() {
        return difficultytotal;
    }

    public void setDifficultytotal(double difficultytotal) {
        this.difficultytotal = difficultytotal;
    }

    public double getPerformancetotal() {
        return performancetotal;
    }

    public void setPerformancetotal(double performancetotal) {
        this.performancetotal = performancetotal;
    }

    public int getSumofexercises() {
        return sumofexercises;
    }

    public void setSumofexercises(int sumofexercises) {
        this.sumofexercises = sumofexercises;
    }
}
