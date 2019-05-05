package com.company.drugiecw;

import com.company.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class Zad27 {

    private Utils utils = new Utils();

    private boolean anagram(String s, String c){
        boolean flag;
        boolean secondInfo = false;
        String compare = s.replace(" ", "");
        String compared = c.replace(" ", "");


        if(compare.length() != compared.length()){
            System.out.println("Nie jest anagramem");
            flag = false;
        } else{
            secondInfo = true;
            String x = utils.allToLowcase(compare);
            String y = utils.allToLowcase(compared);
            char[] compareArr = x.toCharArray();
            char[] comparedArr = y.toCharArray();
            Arrays.sort(compareArr);
            Arrays.sort(comparedArr);
            x = new String(compareArr);
            y = new String(comparedArr);
            flag = x.strip().equals(y.strip());
        }

        if(flag) System.out.println("Jest anagram");
        else if (secondInfo) System.out.println("Nie jest anagramem");

        return flag;
    }

    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 1 ciag znakow");
        String x = sc.nextLine();
        System.out.println("Podaj 2 ciag znakow");
        String y = sc.nextLine();
        anagram(x, y);
    }

}
