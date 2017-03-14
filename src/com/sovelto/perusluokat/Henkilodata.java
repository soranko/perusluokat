package com.sovelto.perusluokat;

/**
 * Created by xxsorank on 8.3.2017.
 */
public final class Henkilodata {

    private Henkilodata() {
    }

    public static String[] haeHenkilonimet() {
        return new String[]{"Janne", "Panu", "Antti", "Kalle", "Simo"};
    }

    public static String haeHenkilonTiedot() {
        return "Senjanen:1970:33000:37.5f";
    }
}