package com.iSad.Modul2.Tugas.Nomor2;

/** This Code are made by Irsyad Zulfikar **/

// Class Burung yang mewarisi Class Binatang
public class Burung extends Binatang {

    // Inisiasi variabel
    public String nama;
    public String terbang;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak kebiasaan hewan burung
    public void terbang(){
        System.out.println("Tingkah Laku\t: " + terbang);
    }
}
