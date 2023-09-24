package com.sevilay.repository;

import com.sevilay.repository.entity.Calisan;

public class CalisanRepository implements ICrud<Calisan> {

    private ConnectionProvider connectionProvider;

    public CalisanRepository() {
        this.connectionProvider = new ConnectionProvider();
    }

    @Override
    public boolean save(Calisan calisan) {
        String sqlSaveQuery = "INSERT INTO tblcalisan (ad, soyad) VALUES (" +
                "'" + calisan.getAd() +
                "','" + calisan.getSoyad() + "')";
        return connectionProvider.executeUpdate(sqlSaveQuery);
    }

}
