import java.util.Scanner;

public class NilaiAkhirMahasiswaMRA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas=sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis=sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts=sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas=sc.nextInt();

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("=============================");
            System.out.println("nilai tidak valid");
            System.out.println("=============================");
            return;
        }

        double nilaiakhir = (0.2*tugas)+(0.2*kuis)+(0.3*uts)+(0.3*uas);
        String huruf = ""; 
        String status = "";
        
        if (nilaiakhir >= 80 && nilaiakhir <= 100) huruf = "A";
        else if (nilaiakhir >= 73) huruf = "B+";
        else if (nilaiakhir >= 65) huruf = "B";
        else if (nilaiakhir >= 60) huruf = "C+";
        else if (nilaiakhir >= 50) huruf = "C";
        else if (nilaiakhir >= 39) huruf = "D";
        else huruf = "E";
        
        if (huruf.equals("A") || huruf.equals("B+") || huruf.equals("B")
                || huruf.equals("C+") || huruf.equals("C")) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        System.out.println("=============================");
        System.out.println("nilai akhir : " + nilaiakhir);
        System.out.println("Nilai Huruf : " + huruf);
        System.out.println("=============================");

        if (status.equals("LULUS")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }

        sc.close();

        
    }
    
}
