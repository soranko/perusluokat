package com.sovelto.kokoelmat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xxsorank on 9.3.2017.
 */
public class Tehokkuustesti {
    public static final int KERTOJA = 2_500_000;

    private static void testaaSuoritus(List<Integer> lista) {
        System.out.println(lista.getClass().getName());

        long alkuaika = System.currentTimeMillis();
        for (int i = 0; i < KERTOJA; i++) {
            lista.add(i);
        }
        long loppuaika = System.currentTimeMillis();
        System.out.println("Lisääminen ms: " + (loppuaika - alkuaika));

        alkuaika = System.currentTimeMillis();
        for (int i = KERTOJA; i > 0; i--) {
            lista.remove(i-1);
            //lista.remove(0);
        }
        loppuaika = System.currentTimeMillis();
        System.out.println("Tyhjennys lopusta ms: " + (loppuaika - alkuaika));
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayListAlkukoko = new ArrayList<>(KERTOJA);
        List<Integer> linkedList = new LinkedList<>();
        testaaSuoritus(arrayList);
        testaaSuoritus(arrayListAlkukoko);
        testaaSuoritus(linkedList);
    }
}
