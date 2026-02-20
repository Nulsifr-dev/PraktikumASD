package Jobsheet2;

public class MataKuliahMain18 {
    public static void main(String[] args) {

        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMK = "IF101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah18 mk2 = new MataKuliah18("IF202", "Struktur Data", 4, 8);

        System.out.println("=== DATA AWAL ===");
        mk1.tampilInformasi();
        mk2.tampilInformasi();

        System.out.println("=== UPDATE DATA ===");
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(10);

        System.out.println("=== DATA SETELAH UPDATE ===");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
    
}
