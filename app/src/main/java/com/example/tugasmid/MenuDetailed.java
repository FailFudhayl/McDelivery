package com.example.tugasmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuDetailed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detailed);

        ImageView iv_menudetail = findViewById(R.id.IV_DetailMenu);
        TextView tv_menudetail = findViewById(R.id.TV_DetailMenu);
        TextView tv_Hargamenudetail = findViewById(R.id.TV_HargadetailMenu);
        Button btn_bayar = findViewById(R.id.btn_pesanMenu);

        Intent intent = getIntent();
        Menus menus = intent.getParcelableExtra("menus");

        iv_menudetail.setImageResource(menus.getMenu_img());
        tv_menudetail.setText(menus.getDesc());
        tv_Hargamenudetail.setText(menus.getPrice());

        btn_bayar.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, QrPembayaran.class);
            startActivity(intent1);
        });

    }
}