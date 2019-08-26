package com.example.android.tourguideapp;

public class NameImageFact {
    private String NameOfPlace;
    private String FactsAboutPlace;
    private int PlaceImage;

    public NameImageFact(String nameOfPlace, String factsAboutPlace, int placeImage) {
        NameOfPlace = nameOfPlace;
        FactsAboutPlace = factsAboutPlace;
        PlaceImage = placeImage;
    }

    public String getNameOfPlace(int position) {
        return NameOfPlace;
    }

    public String getFactsAboutPlace(int position) {
        return FactsAboutPlace;
    }

    public int getPlaceImage(int position) {
        return PlaceImage;
    }
}
