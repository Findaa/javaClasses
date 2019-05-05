package com.company.trzeciecw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Zad33 {

    private static void sumujIZapisz(String nazwaPliku) throws FileNotFoundException, IOException {

        int x = 0;
        File document = new File(nazwaPliku);
        File opt = new File("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/calkowite.txt");

        if (!document.exists()) {
            opt.createNewFile();
        }

        Scanner sc = new Scanner(document);
        while (sc.hasNextLine()) {
            var z = sc.nextLine();
            try {
                x += Integer.parseInt(z);
            } catch (NumberFormatException nfe) {
                System.out.println("nfe");
            }
        }

        x++;
        System.out.println(x);

        var a = System.getProperty("line.separator");
        var result = (a + String.valueOf(x)).getBytes();

        FileOutputStream fop = new FileOutputStream(document, true);
        fop.write(result);
        Thread.yield();

        fop.flush();
        fop.close();
    }

    public void init() throws IOException {
        try {
            sumujIZapisz("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/calkowite.txt");
        } catch (Exception ex) {
            System.out.println("File not found");
        }
    }

}

