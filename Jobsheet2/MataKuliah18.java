package Jobsheet2;

public class MataKuliah18 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah18() {
        kodeMK = "";
        nama = "";
        sks = 0;
        jumlahJam = 0;
    }

    public MataKuliah18(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("-----------------------------");
    }

    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambah. Total jam sekarang: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (jam <= jumlahJam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Sisa jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam tidak mencukupi.");
        }
    }
    
}
