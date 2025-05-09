package UTS;

public class MainClass {
    public static void main(String[] args) {
        Toko toko = new Toko();

        Produk laptop = new Produk("Laptop", 7500000, 10);
        Produk hp = new Produk("Handphone", 3500000, 15);
        Produk headset = new Produk("Headset", 250000, 20);

        toko.tambahProduk(laptop);
        toko.tambahProduk(hp);
        toko.tambahProduk(headset);

        System.out.println("Daftar Produk Awal:");
        toko.tampilkanProduk();

        System.out.println("\nUpdate stok Handphone +5:");
        toko.updateStokProduk("Handphone", 5);
        toko.tampilkanProduk();

        System.out.println("\nCari produk 'Laptop':");
        Produk ditemukan = toko.cariProduk("Laptop");
        if (ditemukan != null) {
            System.out.println(ditemukan);
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }
}