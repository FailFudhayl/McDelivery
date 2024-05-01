package com.example.tugasmid;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.ViewHolder> {

    private ArrayList<Promo> promos;

    public PromoAdapter(ArrayList<Promo> promos) {
        this.promos = promos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promo, parent, false);
        return new PromoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Promo promo = promos.get(position);
        holder.TV_PromoTitle.setText(promo.getTitle());
        holder.IV_PromoIMG.setImageResource(promo.getPromo_img());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.context, PromoDetail.class);
            intent.putExtra("promos", promo);
            holder.context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return promos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView IV_PromoIMG;
        TextView TV_PromoTitle;

        Context context;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            IV_PromoIMG = itemView.findViewById(R.id.IV_ItemPromotion);
            TV_PromoTitle = itemView.findViewById(R.id.TV_TitlePromotion);
            context = itemView.getContext();
        }
    }
}
