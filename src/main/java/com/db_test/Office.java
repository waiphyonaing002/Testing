package com.db_test;

public class Office {
    private int officecode;
    private String City, State;

    public Office(int officecode, String city, String state) {
        this.officecode = officecode;
        this.City = city;
        this.State = state;
    }

    public int getOfficecode() {
        return officecode;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officecode=" + officecode +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
