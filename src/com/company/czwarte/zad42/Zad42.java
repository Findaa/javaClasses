package com.company.czwarte.zad42;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Zad42 {

    public void init(String nameFrom, String nameTo, String nameToTxt) throws IOException {
        System.out.println("Zadanie 4.2: ");
        writeList(nameFrom);
        sizeList();
        createNewList();
        writeObj(nameTo);
        writeTxt(nameToTxt);
        System.out.println("Ilosc domow bez zmiany ceny: " + count/2); //Dzielimy na 2 bo petla z else jest wykonana 2 razy
        count = 0;
        System.out.println(" ");

    }

    private List<Home> homes = new ArrayList<>();
    private int count = 0;

    private void writeList(String file) throws IOException {

        try {
            RandomAccessFile plik = new RandomAccessFile(file, "rw");
            long length = plik.length();
            for (int i = 0; i < length; i++) {
                Home home = new Home();
                String nazwa = plik.readUTF();
                home.setName(nazwa);
                int kond = plik.readInt();
                home.setCond(kond);
                double cena = plik.readDouble();
                home.setPrice(cena);
                homes.add(home);
            }
            plik.close();
        } catch (IOException ignored) {
        }
    }

    //Bez tej metody nie dzialaja petle nie wiedziec czemu.
    private int sizeList() {
        return homes.size();
    }

    private List<Home> createNewList() {
        List<Home> homesAdjusted = new ArrayList<>();
        int size = sizeList();
        Home home;

        for (int i = 0; i < size; i++) {
            Home home2 = new Home();
            home = homes.get(i);
            if ((home.getCond() - 1) == 2) {
                home2.setPrice(home.getPrice() * 1.15);
                home2.setCond(home.getCond());
                home2.setName(home.getName());
            } else {
                home2.setPrice(home.getPrice());
                count++;
            }
            homesAdjusted.add(home2);
        }
        return homesAdjusted;
    }

    private void writeTxt(String name) throws IOException, FileNotFoundException {
        List<Home> list = createNewList();
        List<String> fileContent = new ArrayList<>();

        for(int i = 0; i< list.size(); i++) {
            String temp = homes.get(i).getName() + " " + homes.get(i).getCond() + " " + homes.get(i).getPrice() + " " + list.get(i).getPrice();
            fileContent.add(temp);
        }
        Path out = Paths.get("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/" + name);
        try {
            Files.write(out, fileContent, Charset.forName("UTF-8"));
            Thread.yield();
        } catch (IOException io) {
            System.out.println("IO on write");
        }
    }

    private void writeObj(String name) throws FileNotFoundException, IOException {
        ObjectOutputStream pl;
        List<Home> list = createNewList();
        int size = sizeList();

        try {
            pl = new ObjectOutputStream(new FileOutputStream(name));
            for (int i = 0; i < size; i++) {
                pl.writeObject(list.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
