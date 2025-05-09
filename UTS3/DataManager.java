package UTS3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataManager {
    private List<Integer> angkaList;

    // Konstruktor
    public DataManager() {
        angkaList = new ArrayList<>();
    }

    // Method untuk membaca angka dari file teks
    public void bacaFile(String namaFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int angka = Integer.parseInt(line.trim());
                    angkaList.add(angka);
                } catch (NumberFormatException e) {
                    System.out.println("Baris tidak valid diabaikan: " + line);
                }
            }
            System.out.println("Data berhasil dibaca dari file: " + namaFile);
        } catch (IOException e) {
            throw new IOException("Error membaca file: " + e.getMessage());
        }
    }

    // Method untuk mengurutkan angka menggunakan QuickSort
    public void urutkanQuickSort() {
        if (angkaList.isEmpty()) {
            System.out.println("Tidak ada data untuk diurutkan.");
            return;
        }
        Integer[] array = angkaList.toArray(new Integer[0]);
        quickSort(array, 0, array.length - 1);
        angkaList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Data setelah diurutkan: " + angkaList);
    }

    // Implementasi QuickSort
    private void quickSort(Integer[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private int partition(Integer[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    // Method untuk mencari angka menggunakan Binary Search
    public int cariBinarySearch(int target) {
        if (angkaList.isEmpty()) {
            System.out.println("Daftar kosong, pencarian tidak dapat dilakukan.");
            return -1;
        }
        int left = 0;
        int right = angkaList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = angkaList.get(mid);
            if (midValue == target) {
                System.out.println("Angka " + target + " ditemukan di indeks: " + mid);
                return mid;
            }
            if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Angka " + target + " tidak ditemukan.");
        return -1;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        if (angkaList.isEmpty()) {
            System.out.println("Tidak ada data untuk ditampilkan.");
        } else {
            System.out.println("Daftar angka: " + angkaList);
        }
    }
}