package Jobsheet1;

import java.util.Scanner;

public class IPSemesterMRA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 3, 2, 3, 2, 3, 1, 2};

        double[] nilaiAngka = new double[namaMK.length];
        String[] nilaiHuruf = new String[namaMK.length];
        double[] nilaiSetara = new double[namaMK.length];
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }
        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < namaMK.length; i++) {
            totalNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double IP = totalNilai / totalSKS;

        System.out.println("\nhasil Konversi Nilai");
        System.out.println("======================================================================");
        System.out.printf("%-40s %-15s %-12s %-12s\n",
        "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-40s %-15s %-12s %-12s\n",
            namaMK[i],
            String.format("%.2f", nilaiAngka[i]).replace('.', ','),
            nilaiHuruf[i],
            String.format("%.2f", nilaiSetara[i]).replace('.', ','));
        }

        System.out.println("======================================================================");
        System.out.println("IP : " + String.format("%.2f", IP).replace('.', ','));

        sc.close();
    }
    
}
