package com.projectpboteori;
public class Pohon extends Tumbuhan {
    private int tinggi;

    //constructor
    public Pohon(String nama, int umur, int tinggi, int jumlahKelopak) {
        super(nama, umur,jumlahKelopak);
        this.tinggi = tinggi;
    }
    //overriding
    @Override
    public String tumbuh() {
        return super.tumbuh() + "\nPohon " + nama + " sedang tumbuh...";
    }
    @Override
    public String cetakInfo() {
        return super.cetakInfo() + "\nTinggi: " + tinggi + " meter";
    }
    
}