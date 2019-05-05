package com.company.drugiecw;

import com.company.Utils;

/**
 * Ograniczenia w wielkosci tablicy String sa dodane aby uniknac OutOfMemoryException.
 * Nawet z takimi ograniczeniami laduje sie to do kilku miniut.
 * Sugeruje wtedy po prostu przeladowac program.
 */
public class Zad22 {
    private int countTabs = 0;
    private int countSymbols = 0;
    private String conc = "";
    private Utils utils = new Utils();

    private void mainHi(String[][] tab, String x, int div) {
        int count = 0;
        for (String[] strings : tab) {
            for (String string : strings) {
                if (string.equals(x)) {
                    count++;
                }
            }
        }
//        System.out.println("Match string: " + x);
        System.out.println("Count match string: " + count);
        System.out.println("Avg string length: " + ((double) countSymbols / countTabs));
        System.gc();
        if (conc.equals("")) {
            System.out.println("Nie znaleziono liczb podzielnych przez 5 i niepodzielnych przez dostarczony parametr. Parametr: ");
            System.out.println("p = " + div);
        } else {
            System.out.println("String concat z pierwszych 3 znakow: " + conc);
        }
    }

    private String[][] populateArray(int div) {
        String[][] a = new String[utils.generateInt(2000, 60)][utils.generateInt(1000, 20)];
        for (var i = 0; i < a.length; i++) {
            for (var j = 0; j < a[i].length; j++) {
                a[i][j] = utils.generateToken();
                countTabs++;
                countSymbols = countSymbols + a[i][j].length();
                try {
                    if (i % 5 == 0 && j % 5 == 0 && i % div != 0 && j % div != 0) {
                        if (a[i][j].toString().length() < 3) {
                            conc = conc.concat(a[i][j]);
                        } else
                            conc = conc.concat(a[i][j].substring(0, 2));
                    }
                } catch (ArithmeticException ae) {
                    System.out.println("ae on : " + i + " " + j + " " + div);
                    System.out.println("Prawdopodobnie probowano dzielic przez 0");
                }
            }
        }
        return a;
    }

    public void init() {
        int randDiv = utils.generateInt(9, 0);
        mainHi(populateArray(randDiv), utils.generateToken(), randDiv);
    }
}



