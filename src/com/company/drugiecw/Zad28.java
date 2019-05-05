package com.company.drugiecw;

import com.company.Utils;

import java.util.Scanner;

public class Zad28 {

    private Utils utils = new Utils();
    private void akronim(String s){
        String anagram = "";
        String[] words = s.split(" ");
        for (String word : words) {
            anagram = anagram.concat(word.substring(0, 1));
        }
        System.out.println(utils.allToUppercase(anagram));
    }

    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ciag znakow do akronimu: ");
        String x = sc.nextLine();
        akronim(x);
    }
}
