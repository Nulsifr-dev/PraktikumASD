package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo18 {

    public static void main(String[] args) {

        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());
            System.out.println("----------------------------------");

            list.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
        }

        System.out.println("\nData Mahasiswa:");
        list.tampil();

        System.out.println("----------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------------------");

        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("----------------------------------");

        list.insertionSort();

        int posisi = list.findBinarySearch(cari, 0, list.idx - 1);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}