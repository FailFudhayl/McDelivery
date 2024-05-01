package com.example.tugasmid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public ImageView iv_menuNav, iv_promoNav, iv_outletNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_menuNav = findViewById(R.id.IV_Menu);
        iv_promoNav = findViewById(R.id.IV_Promo);
        iv_outletNav = findViewById(R.id.IV_Outlet);

        FragmentManager fragmentManager = getSupportFragmentManager();

        MenuFragment menuFragment = new MenuFragment();
        PromoFragment promoFragment = new PromoFragment();
        LocationFragment locationFragment = new LocationFragment();

        Fragment fragment = fragmentManager.findFragmentByTag(MenuFragment.class.getSimpleName());

        if (!(fragment instanceof MenuFragment)){
            fragmentManager
                    .beginTransaction()
                    .add(R.id.frame_container, menuFragment)
                    .commit();
        }

        iv_menuNav.setOnClickListener(v -> {
            Fragment fragment1 = fragmentManager.findFragmentByTag(MenuFragment.class.getSimpleName());
            if (!(fragment1 instanceof MenuFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, menuFragment, MenuFragment.class.getSimpleName())
                        .commit();
            }

            iv_menuNav.setBackground(getResources().getDrawable(R.drawable.itembg));
            iv_promoNav.setBackground(new ColorDrawable(Color.TRANSPARENT));
            iv_outletNav.setBackground(new ColorDrawable(Color.TRANSPARENT));
        });

        iv_promoNav.setOnClickListener(v -> {
            Fragment fragment2 = fragmentManager.findFragmentByTag(PromoFragment.class.getSimpleName());
            if (!(fragment2 instanceof PromoFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, promoFragment, PromoFragment.class.getSimpleName())
                        .commit();
            }

            iv_menuNav.setBackground(new ColorDrawable(Color.TRANSPARENT));
            iv_promoNav.setBackground(getResources().getDrawable(R.drawable.itembg));
            iv_outletNav.setBackground(new ColorDrawable(Color.TRANSPARENT));

        });

        iv_outletNav.setOnClickListener(v -> {
            Fragment fragment3 = fragmentManager.findFragmentByTag(LocationFragment.class.getSimpleName());
            if (!(fragment3 instanceof LocationFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, locationFragment, LocationFragment.class.getSimpleName())
                        .commit();
            }

            iv_menuNav.setBackground(new ColorDrawable(Color.TRANSPARENT));
            iv_promoNav.setBackground(new ColorDrawable(Color.TRANSPARENT));
            iv_outletNav.setBackground(getResources().getDrawable(R.drawable.itembg));

        });
    }
}