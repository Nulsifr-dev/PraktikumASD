package CM2;

public class Pembeli {
    String namaPembeli;
    String noHp;
    int nomorAntrian;
    Pembeli prev;
    Pembeli next;

    public Pembeli(int nomorAntrian, String namaPembeli, String noHp) {
        this.nomorAntrian = nomorAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
        this.prev = null;
        this.next = null;
    }
}
