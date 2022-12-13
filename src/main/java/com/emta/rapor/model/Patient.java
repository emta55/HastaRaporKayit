package com.emta.rapor.model;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long dosyaNo;
    private String isim;
    private String soyIsim;
    private String tcKimlik;
    private String taniBasligi;
    private String taniDetaylari;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDosyaNo() {
        return dosyaNo;
    }

    public void setDosyaNo(Long dosyaNo) {
        this.dosyaNo = dosyaNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public String getTaniBasligi() {
        return taniBasligi;
    }

    public void setTaniBasligi(String taniBasligi) {
        this.taniBasligi = taniBasligi;
    }

    public String getTaniDetaylari() {
        return taniDetaylari;
    }

    public void setTaniDetaylari(String taniDetaylari) {
        this.taniDetaylari = taniDetaylari;
    }

}
