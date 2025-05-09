package UTS2;

public class MainClass {
    public static void main(String[] args) {
        // Membuat instance KendaraanManager
        KendaraanManager manager = new KendaraanManager();

        // Membuat beberapa kendaraan
        Kendaraan mobil = new Mobil();
        Kendaraan sepedaMotor = new SepedaMotor();
        Kendaraan bus = new Bus();

        // Menambahkan kendaraan ke manager
        try {
            manager.tambahKendaraan(mobil);
            manager.tambahKendaraan(sepedaMotor);
            manager.tambahKendaraan(bus);

            // Menampilkan laporan perjalanan
            manager.laporanPerjalanan();

            // Menguji pengecualian dengan kendaraan null
            System.out.println("\nMenguji penambahan kendaraan tidak valid:");
            manager.tambahKendaraan(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}