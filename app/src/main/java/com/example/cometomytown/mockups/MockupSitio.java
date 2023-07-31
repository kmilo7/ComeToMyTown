package com.example.cometomytown.mockups;

public class MockupSitio {
    private int photo;
    private String nom;
    private String desc;


    public MockupSitio(int photo, String nom, String desc) {
        this.photo = photo;
        this.nom = nom;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
