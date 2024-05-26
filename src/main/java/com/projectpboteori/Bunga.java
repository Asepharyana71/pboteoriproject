package com.projectpboteori;
public class Bunga extends Tumbuhan {
    private int jumlahKelopak;

    //constructor
    public Bunga(String nama, int umur,int tinggi, int jumlahKelopak) {
        super(nama, umur);
        this.jumlahKelopak = jumlahKelopak;
        this.tinggi = tinggi;
    }
    //overriding
    @Override
    public String tumbuh() {
        return super.tumbuh() + "\nBunga " + nama + " sedang tumbuh...";
    }

    @Override
    public String cetakInfo() {
        return super.cetakInfo() + "\nJumlah Kelopak: " + jumlahKelopak + "\nTinggi: " + tinggi + " meter";
    }
}