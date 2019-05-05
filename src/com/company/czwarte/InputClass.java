package com.company.czwarte;

import java.io.*;
import java.util.Scanner;

public class InputClass {

    public static void odczytScanner(String nPl) throws IOException {
        Scanner in = null;
        try {
            in = new Scanner(new BufferedReader(new FileReader(nPl)));
            int suma = 0;
            while (in.hasNext()) {
                if (in.hasNextInt()) {
                    suma += in.nextInt();
                } else {
                    in.next();
                }
            }
            System.out.println(suma);

        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

    public void zapisRAF() throws IOException {
        try (RandomAccessFile plik = new RandomAccessFile("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/zad42.txt", "rw")) {

            plik.writeUTF("Maly Domek");
            plik.writeInt(1);
            plik.writeDouble(170000.00);

            plik.writeUTF("Sredni domek");
            plik.writeInt(3);
            plik.writeDouble(1840000.00);

            plik.writeUTF("Kamienica");
            plik.writeInt(6);
            plik.writeDouble(9000000);
        }
    }

    public void odczytRAF(String nameFrom) throws IOException {
        RandomAccessFile plik = new RandomAccessFile(nameFrom, "rw");
        try {

            long pozycja = plik.getFilePointer();
            while (pozycja < plik.length()) {
                String nazwa = plik.readUTF();
                int kond = plik.readInt();
                double cena = plik.readDouble();
//                System.out.println(pozycja + " " + nazwa + " " + kond + " " + cena);
                pozycja++;
            }
        }catch(IOException ignored){
        }
    }


}

