package Jobsheet2;

public class DosenMain18 {
    public static void main(String[] args) {

        Dosen18 d1 = new Dosen18();
        d1.idDosen = "D001";
        d1.nama = "Dr. Andi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Basis Data";

        Dosen18 d2 = new Dosen18("D002", "Prof. Budi", false, 2010, "Jaringan Komputer");

        System.out.println("=== DATA AWAL DOSEN ===");
        d1.tampilInformasi();
        d2.tampilInformasi();

        System.out.println("=== UPDATE DATA ===");
        d1.setStatusAktif(false);
        d1.ubahKeahlian("Pemrograman");
        System.out.println("Masa Kerja d1 : " + d1.hitungMasaKerja(2025) + " tahun");

        d2.setStatusAktif(true);
        d2.ubahKeahlian("Keamanan Siber");
        System.out.println("Masa Kerja d2 : " + d2.hitungMasaKerja(2025) + " tahun");

        System.out.println("=== DATA SETELAH UPDATE ===");
        d1.tampilInformasi();
        d2.tampilInformasi();
    }
    
}
