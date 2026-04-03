package Praktikum06;

import java.util.Scanner;

public class DosenDemo18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen18 list = new DataDosen18();

        int pilih;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda-Tertua)");
            System.out.println("4. Sorting DSC (Tertua-Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = sc.nextLine();
                    boolean jk;

                    if (jkInput.equalsIgnoreCase("L")) {
                        jk = true;
                    } else {
                        jk = false;
                    }
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    Dosen18 d = new Dosen18(kd, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DESC");
                    list.tampil();
                    break;
            }
        } while (pilih != 5);
    }
    
}
