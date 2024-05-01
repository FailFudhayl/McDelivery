package com.example.tugasmid;

import java.util.ArrayList;

public class DataPromo {
    public static ArrayList<Promo> promos = generateDummyPromo();

    private static ArrayList<Promo> generateDummyPromo(){
        ArrayList<Promo> promos1 = new ArrayList<>();
        promos1.add(new Promo("Nikmati PaNas 2 Sekarang hanya 31 ribuan!!!",
                "dapatkan PaNas 2 hanya 31ribuan, ayo tukarkan sekarang",
                "Setiap Hari", R.drawable.paket31k));
        promos1.add(new Promo("SPESIAL setiap hari senin-selasa Duo Ayam Spicy McD",
                "SPESIAL setiap hari senin-selasa 2 spicy chicken McD dan 1 minuman Fruit Tea Regular hanya 27.273, super hematt",
                "Senin, Selasa", R.drawable.paket27k));
        promos1.add(new Promo("Hematnya cuman 18 ribuan!",
                "Nikmati 1 ayam crispy dan 1 nasi putih hanya 18 ribuan",
                "Setiap Hari", R.drawable.paket18kori));
        promos1.add(new Promo("Harga Promo! Ayam spicy & Nasi cuma 18 ribuan",
                "hematnya 1 ayam pedas dan 1 nasi putih hanya 18 ribuan ajaa",
                "Setiap Hari", R.drawable.paket18kspicy));
        promos1.add(new Promo("Asik! 5 ayam crispy dan 3 nasi putih hanya 70 ribuan",
                "kenyang bertiga hanya 70 ribuan! daoat 5 ayam crispy dan 3 nasi putih",
                "Setiap Hari", R.drawable.paket70kori));
        promos1.add(new Promo("Nikmati paket kenyang dengan harga spesial",
                "hemat dan kenyang hanya 70 ribuan. nikmati 5 ayam pedas dan 3 nasi putih.",
                "Setiap Hari", R.drawable.paket70kspicy));
        return promos1;
    }
}
