package com.example.tugasmid;

import java.util.ArrayList;

public class DataMenu {
    public static ArrayList<Menus> menuss = generateDummyMenus();

    private static ArrayList<Menus> generateDummyMenus() {
        ArrayList<Menus> menuss1 = new ArrayList<>();
        menuss1.add(new Menus("Ayam Crispy",
                "Ayam digoreng dengan tepung yang sangat guri yang menghasilkan ayam yang sangat crispy krenyes krenyes",
                "Rp. 10.000",
                R.drawable.ayam_crispy));

        menuss1.add(new Menus("Ayam Pedas",
                "Ayam digoreng dengan tepung yang telah diberikan bumbu pedass yang sangatt enakkk sehinga menghasilkan ayam cruncy pedas gurih",
                "Rp. 13.000",
                R.drawable.ayam_pedas));

        menuss1.add(new Menus("Kentang Gorenh",
                "kentang dipotong potong kecil lalu diberi sedikit tepung lalu digorenggg setelah itu diberi bumbuu",
                "Rp. 8.000",
                R.drawable.kentang_goreng));

        menuss1.add(new Menus("Burger",
                "roti lapis yang diberikan beberapa ingredients, seperti daging beef, saus sauss, acar, dan kejuu",
                "Rp. 15.000",
                R.drawable.burger));

        menuss1.add(new Menus("Hot Dog",
                "roti dengan isian sosis dengan tambahan saus spesial",
                "Rp. 15.000",
                R.drawable.hot_dog));

        menuss1.add(new Menus("Nasi Putih",
                "makanan utama pendamping lauk dalam hal ini ayamm",
                "Rp. 5.000",
                R.drawable.nasi_putih));
        menuss1.add(new Menus("Coca Cola",
                "minuman soda penghilanhg haus yang sangat enak",
                "Rp. 5.000",
                R.drawable.coca_cola));

        return menuss1;
    }

}
