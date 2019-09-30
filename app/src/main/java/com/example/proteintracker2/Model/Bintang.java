package com.example.proteintracker2.Model;

import android.widget.ImageView;

public class Bintang {
    private String nama;
    private String nim;
    private String gender;
    private String hobi;
    private String cita;
    private String moto;
    private int foto;
    //private String image;

    public Bintang(String nama, String nim, String gender, String hobi, String cita, String moto, int foto) {
        this.nama = nama;
        this.nim = nim;
        this.gender = gender;
        this.hobi = hobi;
        this.cita = cita;
        this.moto = moto;
        this.foto = foto;

    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getHobi() {
        return hobi;
    }
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
    public String getCita() {
        return cita;
    }
    public void setCita(String cita) {
        this.cita = cita;
    }
    public String getMoto() {
        return moto;
    }
    public void setMoto(String moto) {
        this.moto = moto;
    }
    public int getFoto(){
        return foto;
    }
    public void setFoto(int imageResource){
        this.foto = foto;
    }
}
