package CM1;

import java.util.Scanner;

public class MainPeminjaman {

   static void tampilMahasiswa(Mahasiswa[] data) {
        System.out.println("\n---- Daftar Mahasiswa ----");
        for (Mahasiswa m : data) {
            m.tampil();
        }

    }

    static void tampilBuku(Buku[] data) {
        System.out.println("\n---- Daftar Buku ----");
        for (Buku b : data) {
            b.tampil();
        }
    }

    static void tampilPeminjaman(Peminjaman[] data) {
        System.out.println("\n---- Data Peminjaman ----");
        for (Peminjaman p : data) {
            p.tampil();
        }
    }

    static void urutkanDenda(Peminjaman[] data) {
        for (int i = 1; i < data.length; i++) {
            Peminjaman key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].denda < key.denda) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }

    }

    static void urutkanNIM(Peminjaman[] data) {
        for (int i = 1; i < data.length; i++) {
            Peminjaman key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }

    }

    static void cariPeminjamanNIM(Peminjaman[] original, String nimCari) {

        Peminjaman[] data = original.clone();
        urutkanNIM(data);

        int left = 0, right = data.length - 1;
        int mid = -1;
        boolean ditemukan = false;

        while (left <= right) {
            mid = (left + right) / 2;
            int cmp = data[mid].mhs.nim.compareTo(nimCari);

            if (cmp == 0) {
                ditemukan = true;
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("\nData dengan NIM " + nimCari + " tidak ditemukan mahasiswa.");
            return;
        }

        System.out.println("\n>> Hasil pencarian untuk NIM: " + nimCari);

        int start = mid;
        while (start > 0 && data[start - 1].mhs.nim.equals(nimCari)) start--;

        int end = mid;
        while (end < data.length - 1 && data[end + 1].mhs.nim.equals(nimCari)) end++;

        for (int i = start; i <= end; i++) {
            data[i].tampil();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mahasiswa = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] buku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] peminjaman = {
            new Peminjaman(mahasiswa[0], buku[0], 7),
            new Peminjaman(mahasiswa[1], buku[1], 3),
            new Peminjaman(mahasiswa[2], buku[2], 10),
            new Peminjaman(mahasiswa[2], buku[3], 6),
            new Peminjaman(mahasiswa[0], buku[1], 4)
        };

        int pilihan;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            try {
                pilihan = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Harus memilih pilihan yang tersedia");
                pilihan = -1;
            }

            switch (pilihan) {
                case 1:
                    tampilMahasiswa(mahasiswa);
                    break;

                case 2:
                    tampilBuku(buku);
                    break;

                case 3:
                    tampilPeminjaman(peminjaman);
                    break;

                case 4:
                    urutkanDenda(peminjaman);
                    System.out.println("\nData diurutkan berdasarkan denda terbanyak.");
                    tampilPeminjaman(peminjaman);
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine().trim();

                    if (nim.isEmpty()) {
                        System.out.println("NIM tidak boleh kosong");
                    } else {
                        cariPeminjamanNIM(peminjaman, nim);
                    }
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan != 0);

        
    }

    
}
