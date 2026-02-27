package Praktikum03;

public class DataDosen18 {
    public void dataSemuaDosen(Dosen18[] arrayOfDosen) {
        int no = 1;
        for (Dosen18 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no++);
            d.tampilData();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen18[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen18 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen18[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen18 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0) {
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / jmlPria));
        }
        if (jmlWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / jmlWanita));
        }
    }

    public void infoDosenPalingTua(Dosen18[] arrayOfDosen) {
        Dosen18 tertua = arrayOfDosen[0];

        for (Dosen18 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampilData();
    }

    public void infoDosenPalingMuda(Dosen18[] arrayOfDosen) {
        Dosen18 termuda = arrayOfDosen[0];

        for (Dosen18 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampilData();
    }
    
}
