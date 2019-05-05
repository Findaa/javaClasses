package com.company.czwarte;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Zad41 {
    private int condMa = 0;
    private String tempName;

    public void init(String nameFrom) throws IOException {
        InputClass ip = new InputClass();
        System.out.println("Zadanie 4.1: ");
        ip.zapisRAF();
        adjustPrice(nameFrom);
        ip.odczytRAF(nameFrom);
        System.out.println("Ilosc kondygnacji: " + condMa);
        System.out.println("Nazwa obiektu    : " + tempName);
        System.out.println(" ");
    }

    private void adjustPrice(String file) throws IOException {
        try {
            RandomAccessFile plik = new RandomAccessFile(file, "rw");

            long length = plik.length();
            for (int i = 0; i < length; i++) {
                String nazwa = plik.readUTF();
                int kond = plik.readInt();
                if (kond > condMa) {
                    this.condMa = kond;
                    this.tempName = nazwa;
                }
                long pozycja = plik.getFilePointer();
                double cena = plik.readDouble();
                if(kond == 1) {
                    cena = cena * 0.9;
                    plik.seek(pozycja);
                    plik.writeDouble(cena);
                }
            }
            plik.close();
        } catch (IOException ignored) {
        }
    }


}


