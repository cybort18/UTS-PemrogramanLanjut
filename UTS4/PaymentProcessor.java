package UTS4;

public class PaymentProcessor {
    private static PaymentProcessor instance;

    private PaymentProcessor() {
        // Private constructor
    }

    public static PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void prosesPembayaran(Payment metode, double jumlah) {
        metode.bayar(jumlah);
    }
}