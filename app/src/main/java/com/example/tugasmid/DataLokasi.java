package com.example.tugasmid;

import java.util.ArrayList;

public class DataLokasi {
    public static ArrayList<Lokasi> lokasis = generateDummyLokasi();
    private static ArrayList<Lokasi> generateDummyLokasi(){
        ArrayList<Lokasi> lokasis1 = new ArrayList<>();
        lokasis1.add(new Lokasi("McDonald Jl. A.P. Pettarani",
                "24 Jam",
                "https://maps.app.goo.gl/jD1CMLQ3nY7QvvMQ7",
                R.drawable.mcd_petta));
        lokasis1.add(new Lokasi("McDonald Mall Ratu Indah",
                "24 Jam",
                "https://maps.app.goo.gl/6RppGgE5zXFXmCfJ7",
                R.drawable.mcd_mari));
        lokasis1.add(new Lokasi("McDonald Mall Panakukang",
                "24 Jam",
                "https://maps.app.goo.gl/NW5C9KBVLMixVetm9",
                R.drawable.mcd_mp));
        lokasis1.add(new Lokasi("McDonald Hasanuddin",
                "24 Jam",
                "https://maps.app.goo.gl/FGFdbWStEaw3bGJk7",
                R.drawable.mcd_hasanuddin));
        return lokasis1;
    }

}
