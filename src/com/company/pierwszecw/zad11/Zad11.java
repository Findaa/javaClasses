package com.company.pierwszecw.zad11;
import com.company.Utils;

public class Zad11 {
    private int i       = 1;
    private int max     = -49;
    private int min     = 100;
    private int sm      = 0;
    private int count   = 0;
    private int oldMax  = -49;
    private int newMin  = 0;
    private Utils utils = new Utils();

    public void init() throws ArithmeticException {
        generateData();
        System.out.println("Max: \t\t\t\t" + max);
        System.out.println("Min: \t\t\t\t" + min);
        try {
            System.out.println("Srednia: \t\t\t" + count / sm);
        } catch (ArithmeticException ae) {
            System.out.println("Nie ma liczb spelniajacych warunek parzyste/dodatnie");
            ae.printStackTrace();
        }
    }



    private void generateData() {
        while (i != 0) {
            i = utils.generateInt(101, (-49));
            if (i > max) {
                max = i;
            }

            if (i > oldMax && i < max) {
                oldMax = i;
            }

            if (i < min) {
                min = i;
            }

            if (i > 0) {
                if ((i % 2) == 0) {
                    count = count + i;
                    sm++;
                }
            }
        }

        newMin = min;

        if (newMin < 0) newMin = newMin * (-1);
        if (oldMax < 0) oldMax = oldMax * (-1);
    }

    public int getOldMax() {
        return oldMax;
    }

    public int getNewMin() {
        return newMin;
    }
}