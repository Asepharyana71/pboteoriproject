package com.projectpboteori;

public abstract class Tumbuhan {
    protected String nama;
    protected int umur;
    protected int tinggi;

    public Tumbuhan(String nama, int umur,int tinggi) {
        this.nama = nama;
        this.umur = umur;
        this.tinggi = tinggi;
    }

    public  String tumbuh(){
        return "\nTumbuhan " + nama + " sedang tumbuh...";
    };

    public String cetakInfo() {
        return "Nama: " + nama + "\nUmur: " + umur + " tahun" + "\nTinggi: " + tinggi + " meter";
    }
}

