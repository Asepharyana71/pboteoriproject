package com.projectpboteori;

public abstract class Tumbuhan {
    protected String nama;
    protected int umur;
    protected int tinggi;
    protected int jumlahKelopak;
// Overloading
    public Tumbuhan(String nama, int umur, int tinggi, int jumlahKelopak) {
        this.nama = nama;
        this.umur = umur;
        this.tinggi = tinggi;
        this.jumlahKelopak = jumlahKelopak;
    }
    public Tumbuhan(String nama, int umur,int tinggi) {
        this.nama = nama;
        this.umur = umur;
        this.tinggi = tinggi;
    }
    public Tumbuhan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public Tumbuhan(String nama) {
        this.nama = nama;
    }
    //
    public  String tumbuh(){
        return "\nTumbuhan " + nama + " sedang tumbuh...";
    };

    public String cetakInfo() {
        return "Nama: " + nama + "\nUmur: " + umur + " tahun" ;
    }
}

