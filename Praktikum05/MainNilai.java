package Praktikum05;

public class MainNilai {
    
     public static void main(String[] args) {

        int jumlah = 8;

        Nilai nm = new Nilai(jumlah);

        nm.uts[0] = 78;
        nm.uts[1] = 85;
        nm.uts[2] = 90;
        nm.uts[3] = 76;
        nm.uts[4] = 92;
        nm.uts[5] = 88;
        nm.uts[6] = 80;
        nm.uts[7] = 82;

        nm.uas[0] = 82;
        nm.uas[1] = 88;
        nm.uas[2] = 87;
        nm.uas[3] = 79;
        nm.uas[4] = 95;
        nm.uas[5] = 85;
        nm.uas[6] = 83;
        nm.uas[7] = 84;

        System.out.println("UTS tertinggi (Divide and Conquer): " + nm.maxUTS(nm.uts, 0, jumlah - 1));

        System.out.println("UTS terendah (Divide and Conquer): " + nm.minUTS(nm.uts, 0, jumlah - 1));

        System.out.println("Rata-rata UAS (Brute Force): " + nm.rataUAS());
    }
}
