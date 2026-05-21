package CM2;

import java.util.Scanner;

public class MainAntrian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLAntrian dll = new DLLAntrian();

        System.out.println("=== Inisialisasi Data Antrian Awal ===");
        Pembeli Qcust1 = new Pembeli(0, "Xavier", "08123446789");
        dll.addLastObject(Qcust1);
        Pembeli Qcust2 = new Pembeli(0, "Yuda", "08567896767");
        dll.addLastObject(Qcust2);
        Pembeli Qcust3 = new Pembeli(0, "Zaki", "08991234567");
        dll.addLastObject(Qcust3);
        System.out.println("======================================\n");

        int pilih;

        do {
            System.out.println("\n===============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    dll.addLast(nama, hp);
                    break;

                case 2:
                    dll.print();
                    break;

                case 3:
                    System.out.print("Kode Pesanan : ");
                    int kode = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc.nextLine();

                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();
                    sc.nextLine();

                    Pesanan pesanan = new Pesanan(kode, namaPesanan, harga);
                    dll.remove(pesanan);
                    break;

                case 4:
                    dll.laporanPesanan();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih != 0);

        sc.close();
    }
}