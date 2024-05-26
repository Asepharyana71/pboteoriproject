package com.projectpboteori;
public class Pohon extends Tumbuhan {
    // private int tinggi;

    public Pohon(String nama, int umur, int tinggi) {
        super(nama, umur, tinggi);
    }

    @Override
    public String tumbuh() {
        return super.cetakInfo() + "\nPohon " + nama + " sedang tumbuh...";
    }

    
}