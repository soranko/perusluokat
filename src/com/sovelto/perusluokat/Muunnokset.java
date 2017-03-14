package com.sovelto.perusluokat;

/**
 * Created by xxsorank on 14.3.2017.
 */
public class Muunnokset {

    public static void main(String[] args) {
        String[] tiedot = Henkilodata.haeHenkilonTiedot().split(":");
        String sukunimi = tiedot[0];
        short syntymävuosi = Short.parseShort(tiedot[1]);
        int vuosipalkka = Integer.parseInt(tiedot[2]);
        //short vuosipalkkaShort = Short.parseShort(tiedot[2]);
        float viikkotunnit = Float.parseFloat(tiedot[3]);

        Henkilo hlo = new Henkilo();
        hlo.setSukunimi(sukunimi);
        hlo.setSyntymavuosi(syntymävuosi);
        hlo.setVuosipalkka(vuosipalkka);
        hlo.setViikkotunnit(viikkotunnit);

//        double viikkotunnitDouble = viikkotunnit;
//        hlo.setViikkotunnit((float) viikkotunnitDouble);

        System.out.println(hlo);
    }
}
