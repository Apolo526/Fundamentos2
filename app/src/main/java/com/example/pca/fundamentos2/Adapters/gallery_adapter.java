package com.example.pca.fundamentos2.Adapters;

import com.example.pca.fundamentos2.Models.gallery_model;

import java.util.ArrayList;
import java.util.Random;

public class gallery_adapter {


    public static final String[] tNames = {
            "Toyota 1", "Toyota 2", "Toyota 3", "Toyota 4", "Toyota 5",
            "Toyota 6", "Toyota 7", "Toyota 8", "Toyota 9", "Toyota 10", "Toyota 11",
            "Toyota 12", "Toyota 13", "Toyota 14", "Toyota 15", "Toyota 16", "Toyota 17",
            "Toyota 18", "Toyota 19", "Toyota 20", "Toyota 21", "Toyota 22", "Toyota 23", "Toyota 24",
            "Toyota 25", "Toyota 26", "Toyota 27", "Toyota 28", "Toyota 29", "Toyota 30", "Toyota 31",
            "Toyota 32", "Toyota 33", "Toyota 34", "Toyota 35", "Toyota 36", "Toyota 37",
            "Toyota 39", "Toyota 40", "Toyota 41", "Toyota 42", "Toyota 43", "Toyota 44",
            "Toyota 45", "Toyota 46", "Toyota 47", "Toyota 48", "Toyota 49", "Toyota 50", "Toyota 51"
    };
    public static ArrayList<gallery_model> randomList(int count) {
        Random random = new Random();
        ArrayList<gallery_model> items = new ArrayList<>();

        // Restricción de tamaño
        count = Math.min(count, tNames.length);

        while (items.size() < count) {
            items.add(new gallery_model(tNames[random.nextInt(tNames.length)]));
        }

        return new ArrayList<>(items);
    }


}
