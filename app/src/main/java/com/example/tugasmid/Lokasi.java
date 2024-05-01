package com.example.tugasmid;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Lokasi implements Parcelable {
    private String alamat;
    private String waktu;

    private String link;

    private int location_image;

    protected Lokasi(Parcel in) {
        alamat = in.readString();
        waktu = in.readString();
        link = in.readString();
        location_image = in.readInt();
    }

    public static final Creator<Lokasi> CREATOR = new Creator<Lokasi>() {
        @Override
        public Lokasi createFromParcel(Parcel in) {
            return new Lokasi(in);
        }

        @Override
        public Lokasi[] newArray(int size) {
            return new Lokasi[size];
        }
    };

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLocation_image() {
        return location_image;
    }

    public void setLocation_image(int location_image) {
        this.location_image = location_image;
    }

    public Lokasi(String alamat, String waktu, String link, int location_image) {
        this.alamat = alamat;
        this.waktu = waktu;
        this.link = link;
        this.location_image = location_image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(alamat);
        parcel.writeString(waktu);
        parcel.writeString(link);
        parcel.writeInt(location_image);
    }
}