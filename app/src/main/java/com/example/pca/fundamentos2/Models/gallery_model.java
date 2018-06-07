package com.example.pca.fundamentos2.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.pca.fundamentos2.R;

import java.util.Random;

public class gallery_model  {

    private String name;
    private int idT;

    public gallery_model(String name, int idDrawable) {
        this.name = name;
        this.idT = idT;
    }

    public gallery_model(String name) {
        this.name = name;
        this.idT = getToyota();
    }

    public String getName() {
        return name;
    }

    public int getIdT() {
        return idT;
    }

    private int getToyota() {
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
