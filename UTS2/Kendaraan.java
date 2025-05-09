package UTS2;

public abstract class Kendaraan {
    public abstract void jalan();

    // Method untuk mendapatkan tipe kendaraan
    public String getTipe() {
        return this.getClass().getSimpleName();
    }
}