package com.company.pierwszecw;

import java.util.Scanner;

public class Zad13 {

    private long i;
    private boolean flag = true;

    public void init(String val){
        try {
            this.i = Long.parseLong(val);
            flag = true;
        } catch (NumberFormatException nfe) {
            flag = false;
        } finally {
            if (flag) {
                print(i);
            }
            else getValue();
        }
    }

    private int isOk(long i) {
        String value = String.valueOf(i);
        int length   = value.length();
        int x        = 0;

        for (var j = 0; j < length; j++) {
            x = x + Integer.parseInt(String.valueOf(value.charAt(j)));
        }

        return x;
    }

    private void getValue() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wartosc liczby (sprawdz %3)");
        String stringvalue = sc.nextLine();

        init(stringvalue);
    }

    private boolean print(long i) {
        while (i > 9) {
            i = isOk(i);
        }
        if (i % 3 == 0) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}

