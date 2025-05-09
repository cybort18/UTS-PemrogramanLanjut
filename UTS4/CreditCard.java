package UTS4;

public class CreditCard implements Payment {
    @Override
    public void bayar(double jumlah) {
        System.out.println("Pembayaran " + jumlah + " menggunakan Kartu Kredit berhasil.");
    }
}