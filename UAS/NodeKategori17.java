package UAS;

import java.util.ArrayList;
import java.util.List;

public class NodeKategori17 {
    Kategori17 kategori;
    List<NodeKategori17> children;

    public NodeKategori17(Kategori17 kategori) {
        this.kategori = kategori;
        this.children = new ArrayList<>();
    }

    public void addChild(NodeKategori17 child) {
        this.children.add(child);
    }
}
