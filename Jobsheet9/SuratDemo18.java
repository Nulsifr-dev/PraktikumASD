package Jobsheet9;

import java.util.Scanner;

public class SuratDemo18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat18 stack = new StackSurat18(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("5. Tampilkan Semua Surat");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat18 s = new Surat18(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan");
                    break;

                case 2:
                    Surat18 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat18 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    Surat18 hasil = stack.cariSurat(cari);
                    if (hasil != null) {
                        System.out.println("Surat ditemukan dari " + hasil.namaMahasiswa);
                    } else {
                        System.out.println("Surat tidak ditemukan");
                    }
                    break;

                case 5:
                    System.out.println("Daftar Surat:");
                    stack.print();
                    break;

                case 6:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 6);

        sc.close();
    }
    
}
