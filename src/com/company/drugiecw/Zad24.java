package com.company.drugiecw;

import com.company.Utils;

public class Zad24 {
    private Utils utils = new Utils();

    private void firstlast(String s, char c){
//        System.out.println("Podany string: " + s);
//        System.out.println("Podany char: " + c);
        int last = s.lastIndexOf(c);
        int first = s.indexOf(c);
        if(last > first) {
            String returnString = s.substring(first + 1, last);
            System.out.println("Odleglosc: " + (last - first - 1) + ". Tekst: " + returnString);
        } else{
            System.out.println("Nie znaleziono powtorzenia znaku");
        }
    }

    public void init(){
        firstlast(utils.generateChar(), utils.generateChar().charAt(1));
    }
}

