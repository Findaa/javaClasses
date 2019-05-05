package com.company.pierwszecw;

import java.util.Random;

public class Zad12 {

    private double i             = 5;
    private double max           = -10.0;
    private int compare          = 0;
    private int j                = 1;
    private int count            = 0;
    private float sumEverySecond = 0;
    private float sumByThree     = 0;
    private float sum            = 0;
    private float sum2           = 0;
    private int count2           = 0;
    private Random r             = new Random();

    public void init() {
        generateData(0, 0);
        System.out.println("Suma co 2 wylosowanej: \t\t\t\t\t\t\t\t" + this.sumEverySecond);
        if(count2 != 0) {
            System.out.println("Srednia dodatnich podzielnych przez 3: \t\t\t\t" + this.sumByThree / count2);
        } else {
            System.out.println("Srednia dodanych podzielnych przez 3: \t\t\t\tbrak cyfr podzielnych przez 3");
        }

        generateData(1, this.j);
        System.out.println("Ilosc liczb wiekszych w 2 losowaniu niz max w 1: \t" + compare);
        System.out.println("Różnica średnich: \t\t\t\t\t\t\t\t\t" + ((sum / j) - (sum2 / j)));

        if (sum/j > sum2/j) System.out.println("1 losowanie ma wieksza srednia");
        else System.out.println("Drugie losowanie ma lepsza srednia");
    }

    private void generateData(int x, int size) {
        if (x == 0) {

            while (i != 0) {
                i = (double) Math.round((-10.0 + (10.1 - (-10.0)) * r.nextDouble()) * 10d) / 10d;
                sum += i;
                if ((j % 2) != 0) {
                    this.sumEverySecond += i;
                }

                if (i > 0 && i % 3 == 0) {
                    this.sumByThree += i;
                    this.count2++;
                }
                if (i > this.max) this.max = i;

                this.j++;
            }
        }

        if (x == 1) {
            while (count != size) {
                i = (double) Math.round((-10.1 + (10.1 - (-10.1)) * r.nextDouble()) * 10d) / 10d;
                this.sum2 += i;
                if (i > this.max) this.compare++;
                this.count++;
            }
        }
    }
}


