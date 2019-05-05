package com.company.drugiecw;

import com.company.Utils;

import java.util.Random;
import java.util.Scanner;

public class Zad21 {
    private Random r = new Random();
    private int x = 1;
    private int y = 1;
    private int sum = 0;
    private Scanner sc = new Scanner(System.in);
    private Utils utils = new Utils();

    private void initDimensions(int x, int y) {
        if (x % 4 == 0) {
            this.x = x;
        } else {
            //Mozna podac jakiekolwiek ograniczenia wieksze/mniejsze niz max/min ktore nie sa podzielne przez 4 bo i tak je odrzuci.
            this.x = utils.generateInt(101, 49);
            initDimensions(this.x, this.y);
        }
        if (y % 4 == 0) {
            this.y = y;
        } else {
            this.y = utils.generateInt(101, 49);
            initDimensions(this.x, this.y);
        }
    }

    private int generateInBounds(int a, int b) {
        return r.nextInt((a - (b - 1) + 1) + (b - 1));
    }

    private int[][] populateArray(int a, int b) {
        int[][] tab = new int[x][y];

        for (var i = 0; i < x; i++) {
            for (var j = 0; j < y; j++) {
                if (i != j) {
                    tab[i][j] = generateInBounds(a, b);
                } else {
                    int chance = r.nextInt(100);
                    if (chance < 75) {
                        tab[i][j] = 1;
                    } else tab[i][j] = (-1);
                }
            }
        }
        return tab;
    }

    private void countWhenBigger(int[][] tab) {
        for (var i = 0; i < tab.length; i++) {
            for (var j = 0; j < tab[i].length; j++) {
                if (i * j < tab[i][j]) {
                    sum++;
                }
            }
        }
        System.out.println("*** Wyniki zad 1: ***");
        System.out.println("Ilosc wiekszych liczb: " + sum);
    }

    private void getData() {
        System.out.println("Podaj minimalna wartosc zakresu: ");
        int a = sc.nextInt();
        System.out.println("Podaj maksymalna wartosc zakresu: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Podaj poprawne dane");
            getData();
        } else countWhenBigger(populateArray(a, b));
    }

    public void init() {
        initDimensions(1, 1);
        getData();
    }
}
