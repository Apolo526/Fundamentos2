package com.example.pca.fundamentos2.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.pca.fundamentos2.R;

import java.util.Random;

public class gallery_model implements Parcelable {

    public gallery_model(String name, int idImagen) {
        this.name = name;
        this.idImagen = idImagen;
    }

    private String name;
    private int idImagen;

    protected gallery_model(Parcel in) {
        name = in.readString();
        idImagen = in.readInt();
    }

    public static final Creator<gallery_model> CREATOR = new Creator<gallery_model>() {
        @Override
        public gallery_model createFromParcel(Parcel in) {
            return new gallery_model(in);
        }

        @Override
        public gallery_model[] newArray(int size) {
            return new gallery_model[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }


    private int getRandomGirlDrawable() {
        Random rnd = new Random();
        switch (rnd.nextInt(8)) {
            default:
            case 0:
                return R.drawable.t1;
            case 1:
                return R.drawable.t2;
            case 2:
                return R.drawable.t3;
            case 3:
                return R.drawable.t4;
            case 4:
                return R.drawable.t5;
            case 5:
                return R.drawable.t6;
            case 6:
                return R.drawable.t7;
            case 7:
                return R.drawable.t8;
        }
    }
}
