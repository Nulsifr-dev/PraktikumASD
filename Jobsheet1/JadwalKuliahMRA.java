package Jobsheet1;

import java.util.Scanner;

public class JadwalKuliahMRA {

    public static void inputJadwal(String[][] jadwal, Scanner sc) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal) {
        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static void cariHari(String[][] jadwal, Scanner sc) {
        System.out.print("\nMasukkan hari yang dicari: ");
        String hari = sc.nextLine();

        System.out.println("\nJadwal pada hari " + hari + ":");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s %-15s %-10s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    public static void cariMK(String[][] jadwal, Scanner sc) {
        System.out.print("\nMasukkan nama mata kuliah: ");
        String mk = sc.nextLine();

        System.out.println("\nHasil pencarian mata kuliah:");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.printf("%-25s %-15s %-10s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, sc);

        tampilSemua(jadwal);

        cariHari(jadwal, sc);

        cariMK(jadwal, sc);

    }

    
}
