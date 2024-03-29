package com.example.cometomytown.mockups;

public class MockupHotel{
    private int photo;
    private String nom;
    private String price;
    private String desc;

    public MockupHotel(int photo, String nom, String price, String desc) {
        this.photo = photo;
        this.nom = nom;
        this.price = price;
        this.desc = desc;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}