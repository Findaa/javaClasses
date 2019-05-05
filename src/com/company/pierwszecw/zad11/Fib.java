package com.company.pierwszecw.zad11;

public abstract class Fib {

    public static void getFibonacci(int limit) {
        int i       = 0;
        int j       = 1;
        String str  = "";

        System.out.println("Fibonacci limit: \t" + limit);

        for (int z = 0; i < limit; z++) {
            int s = i + j;
            i = j;
            j = s;

            if(i < limit) str = str + " " + i;
        }

        System.out.println(str);
    }
}