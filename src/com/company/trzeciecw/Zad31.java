package com.company.trzeciecw;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Zad31 {

    private int count = 0;
    private int words = 0;
    private int whitespace = 0;
    private final File document = new File("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/projektBazyFirmyTelekom.txt");
    private int[] result = new int[3];

    private int[] readFile() throws FileNotFoundException {
        Scanner sc = new Scanner(document);
        while (sc.hasNextLine()) {
            String temp = sc.nextLine().toString();
            count += temp.length();
            var noWhitespace = temp.replace(" ", "").replace("\t", "").length();
            whitespace += (temp.length() - noWhitespace);
        }

        FileInputStream fis = new FileInputStream(document);
        byte[] bytesArray = new byte[(int) document.length()];

        try {
            fis.read(bytesArray);
        } catch (IOException io) {
        }

        String s = new String(bytesArray);
        String[] data = s.split(" ");
        for (int i = 0; i < data.length; i++) {
            words++;
        }

        result[0] = count;
        result[1] = whitespace;
        result[2] = words;
        System.out.println(count + " Symbole ogolem");
        System.out.println(whitespace + " Znaki biale");
        System.out.println(words + " Slow");

        return result;
    }


    public void init() throws FileNotFoundException {
        readFile();
    }

}
