package dev.olena;

public class Loops {
    
    public static String[] getMultiplicationTable(int n) {
        String[] table = new String[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = n + " x " + i + " = " + (n * i);
        }
        return table;
    }
}
