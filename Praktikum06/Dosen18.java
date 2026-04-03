package Praktikum06;

public class Dosen18 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen18(String kd, String nm, boolean jk, int us) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("----------------------");
    }
    
}
