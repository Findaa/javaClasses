package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Ograniczenia na generateToken/Char dodane ay uniknac OutOfMemoryError.
 */
public class Utils {
    private Random r = new Random();
    private final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private final String CHARACTERSEXTENDED = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()-=[];'|,./,\\ \"'_+{}:<>?`~";
    private char[] symbols = CHARACTERS.toCharArray();
    private char[] symbols2 = CHARACTERSEXTENDED.toCharArray();

    public String generateToken() {
        return getString(symbols, 10);
    }

    public String generateChar() {
        return getString(symbols2, 4000);
    }

    private String getString(char[] symbols, int size) {
        char[] token = new char[generateInt(size, 0)];
        for (var i = 0; i < token.length; i++) {
            int idx = new Random().nextInt(symbols.length);
            char random = symbols[idx];
            token[i] = random;
        }
        return String.valueOf(token);
    }

    public int generateInt(int max, int min) {
        return r.nextInt((max - min) + 1) + min;
    }

    public String allToLowcase(String y) {
        String allLowerCaseY = y;
        allLowerCaseY = allLowerCaseY
                .replace("A", "a")
                .replace("C", "c")
                .replace("B", "b")
                .replace("D", "d")
                .replace("E", "e")
                .replace("F", "f")
                .replace("G", "g")
                .replace("H", "h")
                .replace("I", "i")
                .replace("J", "j")
                .replace("K", "k")
                .replace("L", "l")
                .replace("M", "m")
                .replace("N", "n")
                .replace("O", "o")
                .replace("P", "p")
                .replace("R", "r")
                .replace("S", "s")
                .replace("T", "t")
                .replace("U", "u")
                .replace("Q", "q")
                .replace("W", "w")
                .replace("V", "v")
                .replace("X", "x")
                .replace("Y", "y")
                .replace("Z", "z")
                .replace(" ", "");
        return allLowerCaseY;
    }

    public String allToUppercase(String y) {
        String allUpperCaseY = y;
        allUpperCaseY = allUpperCaseY
                .replace("a", "A")
                .replace("c", "C")
                .replace("b", "B")
                .replace("d", "D")
                .replace("e", "E")
                .replace("f", "F")
                .replace("g", "G")
                .replace("h", "H")
                .replace("i", "I")
                .replace("j", "J")
                .replace("k", "K")
                .replace("l", "L")
                .replace("m", "M")
                .replace("n", "N")
                .replace("o", "O")
                .replace("p", "P")
                .replace("r", "R")
                .replace("s", "S")
                .replace("t", "T")
                .replace("u", "U")
                .replace("q", "Q")
                .replace("w", "W")
                .replace("v", "V")
                .replace("x", "X")
                .replace("y", "Y")
                .replace("z", "Z")
                .replace(" ", "");
        return allUpperCaseY;
    }

    public void writeFile(String x, File y) throws IOException {
        if(y.exists()) y.delete();
        BufferedWriter writer = new BufferedWriter(new FileWriter(y, true));
        writer.append(x);
        writer.close();
    }
}
