package UAS;

import java.util.ArrayList;
import java.util.List;

public class KategoriTreeMain17 {
    public static void main(String[] args) {
        KategoriTree17 tree = new KategoriTree17();

        NodeKategori17 rootNode = new NodeKategori17(new Kategori17("TOKO ONLINE"));
        tree.root = rootNode;

        NodeKategori17 elektronik = new NodeKategori17(new Kategori17("Elektronik"));
        NodeKategori17 fashion = new NodeKategori17(new Kategori17("Fashion"));
        NodeKategori17 makanan = new NodeKategori17(new Kategori17("Makanan"));

        tree.root.addChild(elektronik);
        tree.root.addChild(fashion);
        tree.root.addChild(makanan);

        elektronik.addChild(new NodeKategori17(new Kategori17("Smartphone")));
        elektronik.addChild(new NodeKategori17(new Kategori17("Laptop")));

        fashion.addChild(new NodeKategori17(new Kategori17("Pria")));
        fashion.addChild(new NodeKategori17(new Kategori17("Wanita")));

        makanan.addChild(new NodeKategori17(new Kategori17("Snack")));
        makanan.addChild(new NodeKategori17(new Kategori17("Minuman")));


        System.out.println("=== SOAL 1: STRUKTUR TREE ===");
        tree.tampilkanTree(tree.root, "");
        System.out.println();

        System.out.println("=== SOAL 2: TRAVERSAL PREORDER ===");
        List<String> listHasil = new ArrayList<>();
        tree.traversePreOrder(tree.root, listHasil);

        System.out.println(String.join(" → ", listHasil));
        System.out.println();

        System.out.println("=== SOAL 3: ANALISIS TREE ===");
        
        System.out.println("a. Root Node         : TOKO ONLINE");
        System.out.println("   Alasan            : Merupakan node hierarki teratas yang menjadi fondasi awal tree dan tidak memiliki parent node.");
        
        System.out.println("b. Jumlah Leaf Node  : 6");
        System.out.println("   Alasan            : Terdiri dari node yang berada di ujung ranting paling bawah dan tidak memiliki anak (Smartphone, Laptop, Pria, Wanita, Snack, Minuman).");
        
        System.out.println("c. Height Tree       : 2");
        System.out.println("   Alasan            : Diukur berdasarkan jumlah maksimal lompatan/jalur dari root menuju leaf terjauh. Level 0 (TOKO ONLINE) -> Level 1 (Elektronik) -> Level 2 (Smartphone).");
        
        System.out.println("d. Child dari Fashion: Pria, Wanita");
        System.out.println("   Alasan            : Merupakan sub-node yang terhubung dan berada tepat satu tingkat di bawah node 'Fashion'.");
    }
    
}
