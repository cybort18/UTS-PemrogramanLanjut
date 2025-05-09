package UTS4;

public class PayPal implements Payment {
    @Override
    public void bayar(double jumlah) {
        System.out.println("Pembayaran " + jumlah + " menggunakan PayPal berhasil.");
    }
}