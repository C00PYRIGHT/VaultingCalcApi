package org.example.vaultingcalcspringapi.model;

public class HorseInput {
    private double rhythm;
    private double relaxation;
    private double connection;
    private double impulsion;
    private double straightness;
    private double Collection;
    private double willingnessAndObedience;
    private double balanceInTempo;
    private double balanceInCircling;
    private double a2deductions;
    private double a3deductions;
    private double a3;

    public HorseInput(double rhythm, double relaxation, double connection, double impulsion, double straightness, double collection, double willingnessAndObedience, double balanceInTempo, double balanceInCircling, double a2deductions,double a3deductions,double a3) {
        this.rhythm = rhythm;
        this.relaxation = relaxation;
        this.connection = connection;
        this.impulsion = impulsion;
        this.straightness = straightness;
        this.Collection = collection;
        this.willingnessAndObedience = willingnessAndObedience;
        this.balanceInTempo = balanceInTempo;
        this.balanceInCircling = balanceInCircling;
        this.a2deductions = a2deductions;
        this.a3deductions = a3deductions;
        this.a3 = a3;
    }

    public double getRhythm() {
        return rhythm;
    }

    public void setRhythm(double rhythm) {
        this.rhythm = rhythm;
    }

    public double getRelaxation() {
        return relaxation;
    }

    public void setRelaxation(double relaxation) {
        this.relaxation = relaxation;
    }

    public double getConnection() {
        return connection;
    }

    public void setConnection(double connection) {
        this.connection = connection;
    }

    public double getImpulsion() {
        return impulsion;
    }

    public void setImpulsion(double impulsion) {
        this.impulsion = impulsion;
    }

    public double getStraightness() {
        return straightness;
    }

    public void setStraightness(double straightness) {
        this.straightness = straightness;
    }

    public double getCollection() {
        return Collection;
    }

    public void setCollection(double collection) {
        Collection = collection;
    }


    public double getWillingnessAndObedience() {
        return willingnessAndObedience;
    }

    public void setWillingnessAndObedience(double willingnessAndObedience) {
        this.willingnessAndObedience = willingnessAndObedience;
    }

    public double getBalanceInTempo() {
        return balanceInTempo;
    }

    public void setBalanceInTempo(double balanceInTempo) {
        this.balanceInTempo = balanceInTempo;
    }

    public double getBalanceInCircling() {
        return balanceInCircling;
    }

    public void setBalanceInCircling(double balanceInCircling) {
        this.balanceInCircling = balanceInCircling;
    }

    public double getA2deductions() {
        return a2deductions;
    }

    public void setA2deductions(double a2deductions) {
        this.a2deductions = a2deductions;
    }


    public double getA3deductions() {
        return a3deductions;
    }

    public void setA3deductions(double a3deductions) {
        this.a3deductions = a3deductions;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }
}
