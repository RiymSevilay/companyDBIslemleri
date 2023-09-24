package com.sevilay;

import com.sevilay.repository.CalisanRepository;
import com.sevilay.repository.entity.Calisan;


public class RunnerCalisanRepository {
    public static void main(String[] args) {

        CalisanRepository calisanRepository = new CalisanRepository();

        System.out.println(calisanRepository.save(new Calisan("Yeliz", "Haliloğlu")));
        System.out.println(calisanRepository.save(new Calisan("Burak", "Barış")));
        System.out.println(calisanRepository.save(new Calisan("Serap","Gül")));

    }
}
