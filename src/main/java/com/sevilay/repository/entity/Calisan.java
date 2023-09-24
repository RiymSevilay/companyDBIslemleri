package com.sevilay.repository.entity;

public class Calisan {

    int id;
    String ad;
    String soyad;

    public Calisan() {
    }

    public Calisan(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

}
