package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo18 {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa18 stack = new StackTugasMahasiswa18(5);
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Nilai Tugas");
            System.out.println("3. Lihat Tugas Terakhir");
            System.out.println("4. Lihat Tugas Pertama");
            System.out.println("5. Hitung Jumlah Tugas");
            System.out.println("6. Tampilkan Semua Tugas");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa18 mhs = new Mahasiswa18(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa18 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa18 lihatTop = stack.peek();
                    if (lihatTop != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihatTop.nama);
                    }
                    break;
                case 4:
                    Mahasiswa18 lihatBottom = stack.peekBottom();
                    if (lihatBottom != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatBottom.nama);
                    }
                    break;
                case 5:
                    System.out.println("Banyak tugas yang dikumpulkan: " + stack.hitungTugas());
                    break;
                case 6:
                    System.out.println("Daftar semua Tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 7);
        scan.close();
    }
    
}
