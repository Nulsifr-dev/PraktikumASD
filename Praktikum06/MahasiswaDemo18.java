package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MahasiswaBerprestasi18 listBubble = new MahasiswaBerprestasi18();
        MahasiswaBerprestasi18 listSelection = new MahasiswaBerprestasi18();
        MahasiswaBerprestasi18 listInsertion = new MahasiswaBerprestasi18();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            listBubble.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
            listSelection.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
            listInsertion.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        listBubble.tampil();

        listBubble.bubbleSort();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        listBubble.tampil();

        listSelection.selectionSort();
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        listSelection.tampil();

        listInsertion.insertionSort();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        listInsertion.tampil();

        listInsertion.insertionSortDesc();
        System.out.println("Data setelah INSERTION SORT (DESC):");
        listInsertion.tampil();
    }
    
}
