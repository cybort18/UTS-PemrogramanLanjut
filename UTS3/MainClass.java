package UTS3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        // Membuat file teks untuk pengujian
        String namaFile = "numbers.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            writer.write("23\n");
            writer.write("12\n");
            writer.write("45\n");
            writer.write("8\n");
            writer.write("19\n");
            writer.write("30\n");
            System.out.println("File " + namaFile + " berhasil dibuat.");
        } catch (IOException e) {
            System.out.println("Error membuat file: " + e.getMessage());
            return;
        }

        // Membuat instance DataManager
        DataManager manager = new DataManager();

        // Menguji fungsionalitas
        try {
            // Membaca file
            manager.bacaFile(namaFile);
            manager.tampilkanData();

            // Mengurutkan data
            System.out.println("\nMengurutkan data dengan QuickSort:");
            manager.urutkanQuickSort();

            // Mencari angka
            System.out.println("\nMencari angka 19:");
            manager.cariBinarySearch(19);

            System.out.println("\nMencari angka 50:");
            manager.cariBinarySearch(50);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}