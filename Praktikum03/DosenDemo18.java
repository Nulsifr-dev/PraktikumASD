package Praktikum03;

import java.util.Scanner;

public class DosenDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen18[] dataDosen = new Dosen18[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
            Boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            dataDosen[i] = new Dosen18(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n=== Data Dosen ===");

        int no = 1;
        for (Dosen18 d : dataDosen) {
            System.out.println("Data Dosen ke-" + no++);
            d.tampilData();
        }

        DataDosen18 data = new DataDosen18();

        System.out.println("\n=== Semua Data Dosen ===");
        data.dataSemuaDosen(dataDosen);

        System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
        data.jumlahDosenPerJenisKelamin(dataDosen);

        System.out.println("\n=== Rata-rata Usia Per Jenis Kelamin ===");
        data.rerataUsiaDosenPerJenisKelamin(dataDosen);

        System.out.println("\n=== Dosen Paling Tua ===");
        data.infoDosenPalingTua(dataDosen);

        System.out.println("\n=== Dosen Paling Muda ===");
        data.infoDosenPalingMuda(dataDosen);

        sc.close();
    }
    
}
