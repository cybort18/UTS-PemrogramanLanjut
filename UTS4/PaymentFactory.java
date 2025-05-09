package UTS4;

public class PaymentFactory {
    public static Payment buatPembayaran(String tipe) {
        if (tipe.equalsIgnoreCase("creditcard")) {
            return new CreditCard();
        } else if (tipe.equalsIgnoreCase("paypal")) {
            return new PayPal();
        } else {
            throw new IllegalArgumentException("Tipe pembayaran tidak dikenali: " + tipe);
        }
    }
}