package com.example.tugasmid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LokasiAdapter extends RecyclerView.Adapter<LokasiAdapter.ViewHolder> {


    private ArrayList<Lokasi> lokasis;
    public LokasiAdapter(ArrayList<Lokasi> lokasis) {
        this.lokasis = lokasis;
    }


    @NonNull
    @Override
    public LokasiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lokasi, parent, false);
        return new LokasiAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LokasiAdapter.ViewHolder holder, int position) {
       Lokasi lokasi = lokasis.get(position);
       holder.IV_lokasiGambar.setImageResource(lokasi.getLocation_image());
       holder.TV_lokasi.setText(lokasi.getAlamat());
       holder.TV_waktu.setText(lokasi.getWaktu());

       holder.btn_location.setOnClickListener(view -> {
           Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasi.getLink()));
           holder.context.startActivity(intent);
       });

    }


    @Override
    public int getItemCount() {
        return lokasis.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView TV_lokasi, TV_waktu;
        ImageView IV_lokasiGambar;

        Button btn_location;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            IV_lokasiGambar = itemView.findViewById(R.id.IV_ItemLocation);
            TV_lokasi = itemView.findViewById(R.id.TV_Location);
            TV_waktu = itemView.findViewById(R.id.TV_WaktuPromo);
            btn_location = itemView.findViewById(R.id.btn_lokasiOutlet);
            context = itemView.getContext();
        }

    }
}