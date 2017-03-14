package com.sovelto.kokoelmat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by xxsorank on 9.3.2017.
 */
public class Listat {

    public static void listPeruskaytto() {
        List<String> nimilistaAL = new ArrayList<String>();
        for (String nimi: Listadata.haeHenkilonimet()) {
            nimilistaAL.add(nimi);
        }
        System.out.println(muotoileKokoelma((nimilistaAL)));

        Collections.sort(nimilistaAL);
        System.out.println(muotoileKokoelma(nimilistaAL));

        nimilistaAL.add("Aku");
        nimilistaAL.remove(4);
        nimilistaAL.remove("Panu");
        System.out.println(muotoileKokoelma(nimilistaAL));

        /*
        String[] taulukko = Listadata.haeHenkilonimet();
        taulukko[12] = "Aku";
        taulukko[4] = "";//null;
        for (int i = 0; i < taulukko.length; i++) {
            System.out.println(taulukko[i].toString());
        }
        */
    }

    private static String muotoileKokoelma (Collection<?> kokoelma) {
        String tuloste = "Listaluokka: " + kokoelma.getClass().getName() + "\n";
        for (Object alkio: kokoelma) {
            tuloste += alkio + "\n";
        }
        return tuloste;
    }

    public static void setPeruskaytto() {
        /*
        Set<String> nimisetti = new HashSet<>();
        for (String nimi: Listadata.haeHenkilonimet()) {
            nimisetti.add(nimi);
        }
        nimisetti.add("Ahti");
        System.out.println(muotoileKokoelma((nimisetti)));
        */
        Set<String> nimisetti = new TreeSet<>();
        for (String nimi: Listadata.haeHenkilonimet()) {
            nimisetti.add(nimi);
        }
        nimisetti.add("Ahti");
        System.out.println(muotoileKokoelma((nimisetti)));
    }

    private static String muotoileKartta(Map<?,?> kartta) {
        String tuloste = "Map-luokka: " + kartta.getClass().getName() + "\n";
        for (Object avain: kartta.keySet()) {
            tuloste += avain + ": " + kartta.get(avain) + "\n";
        }
        return tuloste;
    }

    public static void mapPeuskaytto() {
        Map<Integer, String> nimiMap = new HashMap<Integer, String>();
        String[] nimet = Listadata.haeHenkilonimet();
        for (int i = 0; i<nimet.length; i++) {
            nimiMap.put(i, nimet[i]);
        }
        System.out.println(muotoileKartta(nimiMap));
    }

    public static void main(String[] args) {
        //listPeruskaytto();

        //List<String> nimilistaAaL = Arrays.asList(Listadata.haeHenkilonimet());
        //System.out.println(muotoileKokoelma(nimilistaAaL));

        //setPeruskaytto();

        mapPeuskaytto();
    }
}
