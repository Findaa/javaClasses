package com.company.trzeciecw;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad32 {

    private static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws IOException {
        int i = 0;
        final File document = new File(nazwaPlikWe);
        Scanner sc = new Scanner(document);
        List<String> lines = new ArrayList<>();

        while (sc.hasNextLine()) {
            i++;
            String line = i + ": " + sc.nextLine();
            if (line.contains(slowo.toLowerCase()) || line.contains(slowo.toUpperCase())) {
                lines.add(line);
                System.out.println(line + " line");
            }
        }

        Path out = Paths.get("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/" + nazwaPlikWy + ".txt");

        try {
            Files.write(out, lines, Charset.forName("UTF-8"));
            Thread.yield();
        } catch (IOException io) {
            System.out.println("IO on write");
        }
    }

    public void init() {
        try {
            szukaj("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/projektBazyFirmyTelekom.txt", "plikw", "dtv");
        } catch (IOException io) {
            System.out.println("IO on read");
        }
    }
}
