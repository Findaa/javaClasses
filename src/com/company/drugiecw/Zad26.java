package com.company.drugiecw;

import com.company.Utils;

public class Zad26 {
    private Utils utils = new Utils();

    private int[] revert(int x, int bezuzytecznyparametr) {
        long reversed = 0;
        if(x < 0) {x = (-x);}
        long xAsLong = x;
        var results = new int[3];

        while (xAsLong != 0) {
            reversed = reversed * 10 + xAsLong % 10;
            xAsLong = xAsLong / 10;
        }
        results[0] = (int) reversed;
        results[1] = (int) reversed + x;
        return results;
    }

    public void init(){
        int x = utils.generateInt(999999, -999999);
        System.out.println("Wyjsciowa liczba: " + x);
        System.out.println("Odwrocona liczba: " + revert(x, 0)[0]);
        System.out.println("Suma wart. bezwzgl.: " + revert(x, 0)[1]);
    }
}

