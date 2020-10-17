package com.iSad.Modul2.Tugas.Nomor3;

/** This Code are made by Irsyad Zulfikar **/

// Class DemoPacar
public class DemoPacar {
    public static void main(String[] args) {
        // Inisiasi objek dari kelas Mahasiswa dan Pacar
        Mahasiswa mahasiswa = new Mahasiswa();
        Pacar pacar = new Pacar();

        // Memanggil Method getStatus
        mahasiswa.getStatus();
        pacar.getStatus();
    }
}
