package com.example.cometomytown.mockups;

public class MockupHotel {

    private String nom;
    private String price;
    private int photo;

    public MockupHotel() {
    }

    public MockupHotel(String nom, String price, int photo) {
        this.nom = nom;
        this.price = price;
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

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
