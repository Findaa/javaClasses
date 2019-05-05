package com.company.drugiecw;


import com.company.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Zad23 {
    private Utils utils = new Utils();

    private String[] split2(String x, String[] dlm){
//        System.out.println("Base string: " + x);
        int dlmTabSize= (int) IntStream.range(0, dlm.length).count();
        List<String> splitStrings = new ArrayList<>();

        Arrays.stream(dlm, 0, dlmTabSize).forEach(compare -> {
            if (x.contains(compare)) {
                String[] values = x.split(compare);
                int tempSize = values.length;
                splitStrings.addAll(Arrays.asList(values).subList(0, tempSize));
            }
        });

        if (x.length() != 1) {
            String[] returnValue = new String[splitStrings.size()];
            System.out.println("Array ze podzielonych Strings: " + Arrays.toString(splitStrings.toArray(returnValue)));
            System.out.println("Wszystkie mozlwie kombinacje. Pusty array znaczy, ze nie dalo sie podzielic. Wiecej wymiarow tabeli znaczy wiecej podzielen");
            return splitStrings.toArray(returnValue);
        } else{
            System.out.println("Array ze podzielonych Strings: " + "[" + x + "]");
            String[] diff = new String[1];
            diff[0] = x;
            return diff;
        }
    }

    public void init(){
        split2(utils.generateToken(), generateComparableArray());
    }

    private String[] generateComparableArray(){
        int size = utils.generateInt(100, 1);
        String[] comparable = new String[size];
        Arrays.setAll(comparable, i -> utils.generateToken());
        return comparable;
    }

}
