package com.company.trzeciecw;

import com.company.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad35 {

    private Utils utils = new Utils();

    private void emerytura(String nazwaPliku) throws IOException {
        File document = new File(nazwaPliku);
        File wt = new File("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/kobiety.txt");
        File mt = new File("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/mezczyzni.txt");
        Scanner sc = new Scanner(document);
        List<String[]> list = new ArrayList<>();
        String resultm = "";
        String resultw = "";


        while (sc.hasNextLine()) {
            var x = sc.nextLine();
            String[] z = x.split(" ");
            list.add(z);
        }

        for (String[] x : list) {
            String n = x[0];
            String s = x[1];
            String p = x[2];
            String a = x[3];

            if (p.equals("M")) {
                resultm = resultm.concat(getString(n, s, a));
            } else {
                resultw = resultw.concat(getString(n, s, a));
            }
        }
        utils.writeFile(resultm, mt);
        utils.writeFile(resultw, wt);
        System.out.println(resultm + " result m");
        System.out.println(resultw + " result w");
    }

    private String getString(String n, String s, String a) {
        StringBuilder sbw = new StringBuilder();
        sbw.append(s).append(" ").append(n).append(" ").append(65 - Integer.parseInt(a)).append("\n");
        String result = sbw.toString();
        sbw.delete(0, 200);
        return result;
    }

    public void init() {
        try {
            emerytura("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/osoby.txt");
        } catch (Exception e) {
        }
        ;

    }
}
