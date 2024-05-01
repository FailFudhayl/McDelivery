package com.example.tugasmid;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Menus implements Parcelable{

    private String title;
    private String desc;
    private String price;
    private int menu_img;
    public Menus(String title, String desc, String price, int menu_img) {
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.menu_img = menu_img;
    }

    protected Menus(Parcel in) {
        title = in.readString();
        desc = in.readString();
        price = in.readString();
        menu_img = in.readInt();
    }

    public static final Creator<Menus> CREATOR = new Creator<Menus>() {
        @Override
        public Menus createFromParcel(Parcel in) {
            return new Menus(in);
        }

        @Override
        public Menus[] newArray(int size) {
            return new Menus[size];
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getMenu_img() {
        return menu_img;
    }

    public void setMenu_img(int menu_img) {
        this.menu_img = menu_img;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(desc);
        parcel.writeString(price);
        parcel.writeInt(menu_img);
    }
}
