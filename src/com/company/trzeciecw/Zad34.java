package com.company.trzeciecw;

import com.company.Utils;

import java.io.*;
import java.util.Scanner;

public class Zad34 {

    private Utils utils = new Utils();

    private void szyfruj(String nazwaWe, int przesun) throws IOException {

        File document = new File("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/" + nazwaWe);
        File coded = new File("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/_" + nazwaWe);
        Scanner sc = new Scanner(document);
        String total = "";

        while (sc.hasNextLine()) {
            char[] a = sc.nextLine().toCharArray();
            for (int i = 0; i < a.length; i++) {
                int ascii = (int) a[i];
                a[i] = (char) (ascii + przesun);
            }
            total = total.concat(String.valueOf(a)).concat("\n");
        }

        utils.writeFile(total, coded);
    }

    private void deszyfruj(String nazwaWe, int przesun) throws FileNotFoundException {
        File document = new File("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/" + nazwaWe);
        Scanner sc = new Scanner(document);
        String total = "";

        while (sc.hasNextLine()) {
            char[] a = sc.nextLine().toCharArray();
            for (int i = 0; i < a.length; i++) {
                int ascii = (int) a[i];
                a[i] = (char) (ascii - przesun);
            }
            total = total.concat(String.valueOf(a)).concat("\n");
        }
        System.out.println(total + " Deszyfrowano");
    }

    public void init() {
        try {
            szyfruj("alph.txt", 3);
            deszyfruj("_alph.txt", 3);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
