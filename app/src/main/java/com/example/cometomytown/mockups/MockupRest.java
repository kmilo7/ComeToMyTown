package com.example.cometomytown.mockups;

public class MockupRest{
    private int photo;
    private String nom;
    private String price;


    public MockupRest(int photo, String nom, String price) {
        this.photo = photo;
        this.nom = nom;
        this.price = price;
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
}
