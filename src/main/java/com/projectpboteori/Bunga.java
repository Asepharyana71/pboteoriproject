package com.projectpboteori;
public class Bunga extends Tumbuhan {
    private int jumlahKelopak;

    public Bunga(String nama, int umur,int jumlahKelopak,int tinggi) {
        super(nama, umur,tinggi);
        this.jumlahKelopak = jumlahKelopak;
    }

    @Override
    public String tumbuh() {
        return super.cetakInfo() + "\nBunga " + nama + " sedang tumbuh...";
    }

    public String cetakInfo() {
        return super.cetakInfo() + "\nJumlah Kelopak: " + jumlahKelopak;
    }
}