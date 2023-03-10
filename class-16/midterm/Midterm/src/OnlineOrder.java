import java.util.List;

public class OnlineOrder extends Order {
    private PayOnline paymentMethod;
    public OnlineOrder() {
    }

    public OnlineOrder(Client client, List<Book> bookList) {
        super(client, bookList);
    }

    public PayOnline getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PayOnline paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
