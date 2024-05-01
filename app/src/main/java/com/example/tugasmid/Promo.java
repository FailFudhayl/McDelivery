package com.example.tugasmid;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Promo implements Parcelable {
    private String title;
    private String desc;
    private String time;

    protected Promo(Parcel in) {
        title = in.readString();
        desc = in.readString();
        time = in.readString();
        promo_img = in.readInt();
    }

    public static final Creator<Promo> CREATOR = new Creator<Promo>() {
        @Override
        public Promo createFromParcel(Parcel in) {
            return new Promo(in);
        }

        @Override
        public Promo[] newArray(int size) {
            return new Promo[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPromo_img() {
        return promo_img;
    }

    public void setPromo_img(int promo_img) {
        this.promo_img = promo_img;
    }

    private int promo_img;

    public Promo(String title, String desc, String time, int promo_img) {
        this.title = title;
        this.desc = desc;
        this.time = time;
        this.promo_img = promo_img;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(desc);
        parcel.writeString(time);
        parcel.writeInt(promo_img);
    }
}
