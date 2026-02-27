package Praktikum03;

public class Matakuliah18 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah18(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahdata(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo() {
        System.out.println("Kode        : "+kode);
        System.out.println("Nama        : "+nama);
        System.out.println("Sks         : "+sks);
        System.out.println("Jumlah Jama : "+jumlahJam);
        System.out.println("------------------------------");
    }
    
}
