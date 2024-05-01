package com.example.tugasmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PromoDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo_detail);

        ImageView iv_promotiondetailImg = findViewById(R.id.IV_DetailPromo);
        TextView tv_promotionsDesc = findViewById(R.id.TV_DetailPromo);
        TextView tv_promotionsTime = findViewById(R.id.TV_WaktuPromo);
        TextView tv_tombolBayar = findViewById(R.id.TV_TombolTukarPromo);

        Intent intent = getIntent();
        Promo promo = intent.getParcelableExtra("promos");

        iv_promotiondetailImg.setImageResource(promo.getPromo_img());
        tv_promotionsDesc.setText(promo.getDesc());
        tv_promotionsTime.setText(promo.getTime());

        tv_tombolBayar.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, QrPembayaran.class);
            startActivity(intent1);
        });
    }
}