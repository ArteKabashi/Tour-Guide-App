package com.example.android.tourguideapp;

public class GetInfo {
    private int HeaderImage;
    private String HeaderTitle;
    private String Pharagraph;
    private String Adress;
    private String Hours;

    public GetInfo(int headerImage, String headerTitle, String pharagraph, String adres1, String hours) {
        HeaderImage = headerImage;
        HeaderTitle = headerTitle;
        Pharagraph = pharagraph;
        Adress = adres1;
        Hours = hours;
    }

    public int getHeaderImage(int position) {
        return HeaderImage;
    }

    public String getHeaderTitle(int position) {
        return HeaderTitle;
    }

    public String getPharagraph(int position) {
        return Pharagraph;
    }

    public String getAdress(int position) {
        return Adress;
    }

    public String getHours(int position) {
        return Hours;
    }
}
