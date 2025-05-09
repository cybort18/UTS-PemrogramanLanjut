package UTS4;

public class MainClass {
    public static void main(String[] args) {
        // Mendapatkan instance PaymentProcessor (singleton)
        PaymentProcessor processor = PaymentProcessor.getInstance();

        // Membuat metode pembayaran menggunakan factory
        Payment metode1 = PaymentFactory.buatPembayaran("creditcard");
        Payment metode2 = PaymentFactory.buatPembayaran("paypal");

        // Memproses pembayaran
        processor.prosesPembayaran(metode1, 250000);
        processor.prosesPembayaran(metode2, 500000);
    }
}