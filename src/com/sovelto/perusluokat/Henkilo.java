package com.sovelto.perusluokat;

/**
 * Created by xxsorank on 14.3.2017.
 */
public class Henkilo {

    private String sukunimi;
    private short syntymavuosi;
    private int vuosipalkka;
    private float viikkotunnit;

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public short getSyntymavuosi() {
        return syntymavuosi;
    }

    public void setSyntymavuosi(short syntymavuosi) {
        this.syntymavuosi = syntymavuosi;
    }

    public int getVuosipalkka() {
        return vuosipalkka;
    }

    public void setVuosipalkka(int vuosipalkka) {
        this.vuosipalkka = vuosipalkka;
    }

    public float getViikkotunnit() {
        return viikkotunnit;
    }

    public void setViikkotunnit(float viikkotunnit) {
        this.viikkotunnit = viikkotunnit;
    }

    @Override
    public String toString() {
        StringBuilder tulos = new StringBuilder(sukunimi + "\n");
        tulos.append(syntymavuosi).append("\n");
        tulos.append(vuosipalkka).append(" eur\n");
        String viikkotunnitStr = String.valueOf(viikkotunnit);
        viikkotunnitStr = viikkotunnitStr.replace('.', ',');
        tulos.append(viikkotunnitStr).append(" h");
        return tulos.toString();
//        return "Henkilo{\n" + "\tsukunimi=" + sukunimi + "\n\tsyntymavuosi=" + syntymavuosi + "\n\tvuosipalkka=" + vuosipalkka + "eur\n\tviikkotunnit=" + viikkotunnit + "h\n}";
    }

//    @Override
//    public String toString() {
//        return "Henkilo{" + "sukunimi=" + sukunimi + ", syntymavuosi=" + syntymavuosi + ", vuosipalkka=" + vuosipalkka + ", viikkotunnit=" + viikkotunnit + '}';
//    }
//
}
