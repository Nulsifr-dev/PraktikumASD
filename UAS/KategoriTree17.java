package UAS;

import java.util.List;

public class KategoriTree17 {
    NodeKategori17 root;
    
    public KategoriTree17() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void tampilkanTree(NodeKategori17 node, String indentasi) {
        if (node != null) {
            System.out.print(indentasi);
            node.kategori.tampilInformasi();
            System.out.println();

            for (NodeKategori17 child : node.children) {
                tampilkanTree(child, indentasi + "   ");
            }
        }
    }

    public void traversePreOrder(NodeKategori17 node, List<String> hasil) {
        if (node != null) {
            hasil.add(node.kategori.namaKategori);
            for (NodeKategori17 child : node.children) {
                traversePreOrder(child, hasil);
            }
        }
    }
    
}
