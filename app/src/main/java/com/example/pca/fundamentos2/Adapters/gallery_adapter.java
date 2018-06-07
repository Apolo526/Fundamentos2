package com.example.pca.fundamentos2.Adapters;

import com.example.pca.fundamentos2.Models.gallery_model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class gallery_adapter {


    public static final String[] tNames = {
            "Catherine", "Evelyn", "Phyllis", "Beverly", "Michelle",
            "Denise", "Virginia", "Ruth", "Barbara", "Amanda", "Anna",
            "Catherine", "Melissa", "Sandra", "Julia", "Paula", "Kimberly",
            "Diane", "Betty", "Sharon", "Ruby", "Barbara", "Ann", "Phyllis",
            "Linda", "Marie", "Deborah", "Sara", "Gloria", "Karen", "Patricia",
            "Donna", "Catherine", "Louise", "Catherine", "Joyce", "Katherine",
            "Janice", "Cheryl", "Lisa", "Andrea", "Elizabeth", "Nicole",
            "Cynthia", "Angela", "Donna", "Deborah", "Sandra", "Cheryl", "Jane"
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
