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

        double nilaiakhir=((0.2*tugas)+(0.2*kuis)+(0.3*uts)+(0.3*uas));
        String huruf= "", status="";
        if (nilaiakhir >= 80) huruf="A";
        else if (nilaiakhir >= 73) huruf="B+";
        else if (nilaiakhir >= 65) huruf="B";
        else if (nilaiakhir >= 60) huruf="C+";
        else if (nilaiakhir >= 50) huruf="C";
        else if (nilaiakhir >= 39) huruf="D";
        else huruf="E";
        
    }
    
}
