package com.sovelto.perusluokat;


import java.io.Console;
import java.util.Locale;

/**
 * Created by xxsorank on 8.3.2017.
 */
public class Merkkijonot {

    @SuppressWarnings("StringEquality")
    private static void merkkijonoalustus() {
        String eka = "aku";
        String toka = "aku";
        @SuppressWarnings("RedundantStringConstructorCalls")
        String kolmas = new String("aku"); // EI NÄIN
        String neljas = String.valueOf(new char[]{'a', 'k', 'u'});

        System.out.println("eka == toka: " + (eka == toka));  //EI NÄIN
        System.out.println("eka == kolmas: " + (eka == kolmas)); // EI NÄIN
        System.out.println("eka equals toka: " + eka.equals(toka));
        System.out.println("eka equals kolmas: " + eka.equals(kolmas));
    }

    private static void stringBuilderTehokkuusTesti() {
        int kertoja = 100_000;
        long alku, loppu;

        String s = null;
        alku = System.nanoTime();
        for (int i = 0; i < kertoja; i++) {
            s += "x";
        }
        loppu = System.nanoTime();
        System.out.println(String.format(Locale.US,
                "String ja +: %fms", (loppu - alku) / 1000000.0));

        alku = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < kertoja; i++) {
            sb.append("x");
        }
        loppu = System.nanoTime();
        System.out.println(String.format(Locale.US, "StringBuilder ja +: %fms", (loppu - alku) / 1000000.0));

    }

    private static void merkkijonoPeruskayttoConsole() {
        Console konsoli = System.console();
        konsoli.printf("Anna e-mail: ");
        String email = konsoli.readLine();

    }

    public static void main(String[] args) {
        //merkkijonoalustus();
        //stringBuilderTehokkuusTesti();
        merkkijonoPeruskayttoConsole();
    }
}
