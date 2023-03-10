import java.util.Date;

public class SpecialOffer {
    private Client client;
    private Order order;
    public SpecialOffer(Client c, Order or) {
        this.client = c;
        this.order = or;
    }

    public String getSpecialOffer (Client c, Order or) {
        Date birthday = c.getDateOfBirth();
        int month = birthday.getMonth();
        int day = birthday.getDay();
        Date today = new Date();
        int currentMonth = today.getMonth();
        int currentDay = today.getDay();

        if (month == currentMonth && day == currentDay) {
            return "Happy Birthday! 10% off your order!";
        } else if (or.getBookList().size() >= 4) {
            return "You have received a special discount of 10% off your order!";
        } else {
            for (Book book : or.getBookList()) {
                if (book.getYearPublished() == 2022 || book.getYearPublished() == 2023) {
                    return "You have received a special offer of 10% off your order!";
                }
            }
        }
        return "No special offer today.";
    }

    public void printSpecialOffer() {
        System.out.println(this.getSpecialOffer(this.client, this.order));
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
