package UTS2;

import java.util.ArrayList;
import java.util.List;

public class KendaraanManager {
    private List<Kendaraan> daftarKendaraan;

    // Konstruktor
    public KendaraanManager() {
        daftarKendaraan = new ArrayList<>();
    }

    // Method untuk menambah kendaraan
    public void tambahKendaraan(Kendaraan kendaraan) throws IllegalArgumentException {
        if (kendaraan == null) {
            throw new IllegalArgumentException("Kendaraan tidak valid (null)!");
        }
        daftarKendaraan.add(kendaraan);
        System.out.println("Kendaraan " + kendaraan.getTipe() + " berhasil ditambahkan.");
    }

    // Method untuk menampilkan laporan perjalanan
    public void laporanPerjalanan() {
        if (daftarKendaraan.isEmpty()) {
            System.out.println("Tidak ada kendaraan yang terdaftar.");
            return;
        }
        System.out.println("\nLaporan Perjalanan Kendaraan:");
        for (Kendaraan kendaraan : daftarKendaraan) {
            try {
                System.out.print("Kendaraan " + kendaraan.getTipe() + ": ");
                kendaraan.jalan();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}