package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa18[] arrayOfMahasiswa = new Mahasiswa18[3];
        String dummy;

        for(int i=0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa18();

            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (1 +i));
            arrayOfMahasiswa[i].cetakInfo();
        }

    }
    
}
