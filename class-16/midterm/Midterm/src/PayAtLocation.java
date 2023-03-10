public class PayAtLocation extends Payment {
    public PayAtLocation() {
    }
    public double calculateTotalPrice(double bookPrice, double fee, int quantity, double taxes) {
        return bookPrice * quantity + fee + taxes;
    }
}
