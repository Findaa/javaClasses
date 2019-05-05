package com.company.czwarte;


import java.io.Serializable;

class Test implements Serializable {
    private int p1;
    private float p2;

    public Test(int p1, float p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void wyswietl() {
        System.out.printf("%d %.2f\n", p1, p2);
    }
}