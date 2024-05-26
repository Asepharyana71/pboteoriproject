package com.projectpboteori;
public class Pohon extends Tumbuhan {
    // private int tinggi;

    //constructor
    public Pohon(String nama, int umur, int tinggi) {
        super(nama, umur, tinggi);
    }
    //overriding
    @Override
    public String tumbuh() {
        return super.tumbuh() + "\nPohon " + nama + " sedang tumbuh...";
    }

    
}