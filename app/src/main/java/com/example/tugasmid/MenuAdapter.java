package com.example.tugasmid;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private ArrayList<Menus> menus;


    public MenuAdapter(ArrayList<Menus> menus) {
        this.menus = menus;
    }

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new MenuAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {
        Menus menus1 = menus.get(position);
        holder.TV_TitleMenu.setText(menus1.getTitle());
        holder.IV_ItemMenus.setImageResource(menus1.getMenu_img());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.context, MenuDetailed.class);
            intent.putExtra("menus", menus1);
            holder.context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
       return menus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView TV_TitleMenu;
        ImageView IV_ItemMenus;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TV_TitleMenu = itemView.findViewById(R.id.TV_TitleMenu);
            IV_ItemMenus = itemView.findViewById(R.id.IV_ItemMenus);
            context = itemView.getContext();
        }

    }
}
