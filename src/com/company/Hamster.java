package com.company;

public class Hamster {
    private double dailyRate;
    private double greed;

    public Hamster(double dailyRate, double greed) {
        this.dailyRate = dailyRate;
        this.greed = greed;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getGreed() {
        return greed;
    }

    public void setGreed(double greed) {
        this.greed = greed;
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "dailyRate=" + dailyRate +
                ", greed=" + greed +
                '}';
    }
}
