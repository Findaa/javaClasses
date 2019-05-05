package com.company.pierwszecw;

import java.util.Scanner;

public class Zad14 {

    private boolean flag = true;

    public void init(String x, String y) {
        try {
            int g = Integer.parseInt(x);
            int h = Integer.parseInt(y);
            count(g, h);
            flag = true;

        } catch (NumberFormatException nfe) {
            System.out.println("nfe");
            flag = false;
        } finally {
            if(!flag){
                getValue();
            }
        }
    }

    private void getValue() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj 1 rok");
        String x = sc.nextLine();

        System.out.println("Podaj 2 rok");
        String y = sc.nextLine();

        init(x, y);
    }

    private void count(int x, int y) {
        var z = 0;
        var days = 0;
        var start = Integer.min(x, y);

        if (x > y) z = x - y;
        else z = y - x;

        for (int i = 0; i < z + 1; i++) {
            if (((start + i) % 4 == 0) && ((start + i % 100 != 0) || (start + i % 400 == 0))) {
                days += 366;
            } else {
                days += 365;
            }
        }
        System.out.println("Dni: " + days);
    }
}
