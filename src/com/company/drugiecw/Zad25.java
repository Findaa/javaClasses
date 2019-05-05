package com.company.drugiecw;

import java.util.*;
import java.util.stream.Collectors;

public class Zad25 {

    private void sortuj(String s){
        int len = 0;
        int count = 0;
        String[] words = s.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(words));
        for (String word : words) {
            len += word.length();
            count++;
        }
        //zad 2 kolos ^^^^
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        String result = sortedList.toString().replace(",", "").replace("[", "").replace("]", "");
        System.out.println("Srednia dlugosc znaku: " + (double) len/count);
        System.out.println(result);
    }

    public void init(){
        System.out.println("Wpisz zdanie do posortowania: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(!s.equals("")) {
            sortuj(s);
        } else init();
    }
}
