package CM2;

public class DLLAntrian {
    Pembeli headAntrian;
    Pembeli tailAntrian;
    int size;
    int nomor = 1;

    Pesanan headPesanan;
    Pesanan tailPesanan;

    public boolean isEmpty() {
        return headAntrian == null;
    }

    public void addLast(String nama, String noHp) {
        Pembeli baru = new Pembeli(nomor, nama, noHp);

        if (isEmpty()) {
            headAntrian = tailAntrian = baru;
        } else {
            tailAntrian.next = baru;
            baru.prev = tailAntrian;
            tailAntrian = baru;
        }

        size++;
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomor);
        nomor++;
    }

    public void addLastObject(Pembeli baru) {
        baru.nomorAntrian = nomor;
        
        if (isEmpty()) {
            headAntrian = tailAntrian = baru;
        } else {
            tailAntrian.next = baru;
            baru.prev = tailAntrian;
            tailAntrian = baru;
        }
        
        size++;
        nomor++;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("========================================");
        System.out.println("No Antrian \t Nama \t\t\t No HP");

        Pembeli current = headAntrian;
        while (current != null) {
            System.out.println(current.nomorAntrian + "\t\t " + current.namaPembeli + "\t\t\t " + current.noHp);
            current = current.next;
        }
    }

    public void tambahPesanan(Pesanan baru) {
        if (headPesanan == null) {
            headPesanan = tailPesanan = baru;
        } else {
            tailPesanan.next = baru;
            baru.prev = tailPesanan;
            tailPesanan = baru;
        }
    }

    public void remove(Pesanan pesanan) {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada pelanggan yang perlu dilayani.");
            return;
        }

        Pembeli dilayani = headAntrian;
        System.out.println(dilayani.namaPembeli + " telah memesan " + pesanan.namaPesanan);

        tambahPesanan(pesanan);

        if (headAntrian == tailAntrian) {
            headAntrian = tailAntrian = null;
        } else {
            headAntrian = headAntrian.next;
            headAntrian.prev = null;
        }

        size--;
        System.out.println("Maka antrian harus berkurang.");
    }

    public void sortPesanan() {
        if (headPesanan == null || headPesanan.next == null) {
            return; 
        }

        boolean tukar;
        do {
            tukar = false;
            Pesanan current = headPesanan;

            while (current.next != null) {
                if (current.namaPesanan.compareToIgnoreCase(current.next.namaPesanan) > 0) {
                    
                    int tempKode = current.kodePesanan;
                    String tempNama = current.namaPesanan;
                    int tempHarga = current.harga;

                    current.kodePesanan = current.next.kodePesanan;
                    current.namaPesanan = current.next.namaPesanan;
                    current.harga = current.next.harga;

                    current.next.kodePesanan = tempKode;
                    current.next.namaPesanan = tempNama;
                    current.next.harga = tempHarga;

                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }

    public void laporanPesanan() {
        if (headPesanan == null) {
            System.out.println("Belum ada rekap pesanan.");
            return;
        }

        sortPesanan();

        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("========================================");
        System.out.println("Kode Pesanan \t Nama Pesanan \t\t Harga");

        Pesanan current = headPesanan;
        int total = 0;

        while (current != null) {
            System.out.println(current.kodePesanan + "\t\t " + current.namaPesanan + "\t\t\t " + current.harga);
            total += current.harga;
            current = current.next;
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Pendapatan Restoran: Rp " + total);
    }
}