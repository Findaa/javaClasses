package com.company;

import com.company.czwarte.InputClass;
import com.company.czwarte.Zad41;
import com.company.czwarte.zad42.Zad42;
import com.company.drugiecw.*;
import com.company.pierwszecw.Zad12;
import com.company.pierwszecw.Zad13;
import com.company.pierwszecw.Zad14;
import com.company.pierwszecw.zad11.Fib;
import com.company.pierwszecw.zad11.Zad11;
import com.company.trzeciecw.*;

import java.io.IOException;
import java.util.Scanner;
import java.lang.System;

abstract class Program {

    static int menuOption() {
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        try {
            return Integer.parseInt(option);
        }catch(NumberFormatException nfe){
            Main.main(new String[0]);
            return 8;
        }
    }

    static void initFirt() {
        Zad11 ri = new Zad11();
        Zad12 rd = new Zad12();
        Zad13 th = new Zad13();
        Zad14 cy = new Zad14();

        System.out.println("Zestaw 1: ");
        System.out.println("***Zadanie 1.1***");
        ri.init();
        Fib.getFibonacci(ri.getOldMax() * ri.getNewMin());

        System.out.println(" ");
        System.out.println("***Zadanie 1.2***");
        rd.init();

        System.out.println(" ");
        System.out.println("***Zadanie 1.3***");
        th.init("a");

        System.out.println(" ");
        System.out.println("***Zadanie 1.4***");
        cy.init("a", "b");
        Main.main(new String[0]);
    }

    static void initSecond(){
        Zad22 zad22 = new Zad22();
        Zad21 zad21 = new Zad21();
        Zad23 zad23 = new Zad23();
        Zad24 zad24 = new Zad24();
        Zad25 zad25 = new Zad25();
        Zad26 zad26 = new Zad26();
        Zad27 zad27 = new Zad27();
        Zad28 zad28 = new Zad28();

        System.out.println("Zestaw 2: ");
        System.out.println("***Zadanie 2.1***");
        zad21.init();

        System.out.println(" ");
        System.out.println("***Zadanie 2.2***");
        zad22.init();

        System.out.println(" ");
        System.out.println("***Zadanie 2.3***");
        zad23.init();

        System.out.println(" ");
        System.out.println("***Zadanie 2.4***");
        zad24.init();

        System.out.println(" ");
        System.out.println("***Zadanie 2.5***");
        zad25.init();

        System.out.println(" ");
        System.out.println("***Zadanie 2.6***");
        zad26.init();

        System.out.println(" ");
        System.out.println("***Zadanie 2.7***");
        zad27.init();

        System.out.println(" ");
        System.out.println("***Zadanie 2.8***");
        zad28.init();

        Main.main(new String[0]);
    }

    static void initThird() throws IOException {
        Zad31 zad31 = new Zad31();
        Zad32 zad32 = new Zad32();
        Zad33 zad33 = new Zad33();
        Zad34 zad34 = new Zad34();
        Zad35 zad35 = new Zad35();
        Zad36 zad36 = new Zad36();
        System.out.println("Zestaw 3: ");
        System.out.println("***Zadanie 3.1***");
        zad31.init();
        System.out.println("***Zadanie 3.2");
        zad32.init();
        System.out.println("***Zadanie 3.3***");
        zad33.init();
        System.out.println("***Zadanie 3.4***");
        zad34.init();
        System.out.println("***Zadanie 3.5***");
        zad35.init();
        System.out.println("***Zadanie 3.6***");
        zad36.init();

    }

    static void initFourth() throws IOException{
        Zad41 zad41 = new Zad41();
        Zad42 zad42 = new Zad42();
        InputClass ip = new InputClass();

        zad41.init("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/zad42.txt");
        zad42.init("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/Zad42.txt", "/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/Zad422.txt", "PureTxt.txt");

    }

}