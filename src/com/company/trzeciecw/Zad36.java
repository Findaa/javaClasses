package com.company.trzeciecw;

import com.company.Utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad36 {

    private void createHtml(File txt) throws IOException {
        Utils utils = new Utils();
        Scanner sc = new Scanner(txt);
        List<String[]> list = new ArrayList<>();
        File site = new File("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/website.html");

        String htmlCode =
                "<html><html><body><table><tr><td>Imie</td><td>Nazwisko</td><td>Plec</td><td>Wiek</td></tr>";
        String ending =
                "</table></body></html>";

        while (sc.hasNextLine()) {
            String x = sc.nextLine();
            String[] z = x.split(" ");
            list.add(z);
        }

        for (String[] x : list) {
            String n = x[0];
            String s = x[1];
            String p = x[2];
            String a = x[3];
            String tr = "<tr><td>" + n + "</td><td>" + s + "</td><td>" + p + "</td><td>" + a + "</td></tr>\n";
            htmlCode = htmlCode.concat(tr);
        }

        utils.writeFile(htmlCode.concat(ending), site);

    }

    public void init() {
        File file = new File("/Users/michalcoo/IdeaProjects/javaProjects/mcopjavaue/src/res/osoby.txt");
        try {
            createHtml(file);
        } catch (IOException ignored) {
        }

    }

}
