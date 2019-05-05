package com.company;


import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Zadania z cwiczen:");
        System.out.println("Cwiczenia 1 - wpisz 1");
        System.out.println("Cwiczenia 2 - wpisz 2");
        System.out.println("Cwiczenia 3 - wpisz 3");
        System.out.println("Cwiczenia 4 - wpisz 4");
        System.out.println("Wyjscie - wpisz 0");

        int menu = Program.menuOption();

        try {
            if (menu == 1) {
                Program.initFirt();
            }

            if (menu == 2) {
                Program.initSecond();
            }

            if (menu == 3) {
                try {
                    Program.initThird();
                } catch (Exception ex) {
                    System.out.println("File not found");
                }
            }

            if (menu == 4) {
                try {
                    Program.initFourth();

                } catch (IOException ignored){}
            }

            if (menu == 0) {
                System.exit(420);

            } else main(new String[0]);
        } catch (NullPointerException e) {
            System.out.println("Sprobuj ponownie bez zbednego entera");
            main(new String[0]);
        }
    }
}

