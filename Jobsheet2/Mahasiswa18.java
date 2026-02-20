package Jobsheet2;

public class Mahasiswa18 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa18() {
    }

    public Mahasiswa18(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    
    void tampilkanInformasi() {
        System.out.println("Nama: "+nama);
        System.out.println("Nim: "+nim);
        System.out.println("IPK: "+ipk );
        System.out.println("Kelas: "+kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
        if (0.0 < ipk && ipk < 4.0) {
            System.out.println("IPK valid: "+ipk);
        } else {
            System.out.println("IPK tidka valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinera baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    


}
