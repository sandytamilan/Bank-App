package com.example.bankapplication;

public class Beneficiary {
    private String name;
    private int ac;
    private String ifsc;

    public Beneficiary(String name, int ac, String ifsc) {
        this.name = name;
        this.ac = ac;
        this.ifsc = ifsc;
    }

    @Override
    public String toString() {
        return "Beneficiary{" +
                "name='" + name + '\'' +
                ", ac=" + ac +
                ", ifsc='" + ifsc + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

}