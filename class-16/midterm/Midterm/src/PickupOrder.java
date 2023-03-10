import java.util.List;

public class PickupOrder extends Order {

    private PayAtLocation paymentMethod;
    public PickupOrder() {
    }

    public PickupOrder(Client client, List<Book> bookList) {
        super(client, bookList);
    }

    public PayAtLocation getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PayAtLocation paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
