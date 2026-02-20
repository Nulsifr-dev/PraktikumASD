package Jobsheet1;

public class RoyalGardenMRA {

    public static int hitungPendapatan(int[] stok, int[] harga) {
        int total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }

    public static void main(String[] args) {

        String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        int[][] stok = {
            {10, 5, 15, 7},//Cabang1
            {6, 11, 9, 12},//Cabang2
            {2, 10, 10, 5},//Cabang3
            {5, 7, 12, 9}//cabang4
        };

        int[] harga = {75000, 50000, 60000, 10000};

        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        System.out.println("=== DATA PENJUALAN ROYALGARDEN ===\n");

        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n",
                "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");

        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10d\n",
                    cabang[i], stok[i][0], stok[i][1], stok[i][2], stok[i][3]);
        }

        System.out.println("\n=== PENDAPATAN TIAP CABANG ===");

        System.out.printf("%-15s %-20s %-20s\n",
                "Cabang", "Pendapatan", "Status");

        for (int i = 0; i < cabang.length; i++) {

            int pendapatan = hitungPendapatan(stok[i], harga);

            String status;
            if (pendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.printf("%-15s Rp%,15d %-20s\n", cabang[i], pendapatan, status);
        }
        
    }
    

}