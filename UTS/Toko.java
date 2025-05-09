package UTS;

import java.util.ArrayList;

public class Toko {
    private ArrayList<Produk> daftarProduk;

    public Toko() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public Produk cariProduk(String nama) {
        for (Produk p : daftarProduk) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                return p;
            }
        }
        return null;
    }

    public void updateStokProduk(String nama, int jumlah) {
        Produk p = cariProduk(nama);
        if (p != null) {
            p.updateStok(jumlah);
        } else {
            System.out.println("Produk tidak ditemukan: " + nama);
        }
    }

    public void tampilkanProduk() {
        for (Produk p : daftarProduk) {
            System.out.println(p);
        }
    }
}