public class PayOnline extends Payment {
    public PayOnline() {
    }
    public double calculateTotalPrice(double bookPrice, double fee, int quantity, double taxes) {
        return bookPrice * quantity + fee + taxes;
    }

    public void pay (double totalPrice) {
        System.out.println("Total price: " + totalPrice);
    }

    public class CreditCard {
        private String cardNumber;
        private String cvv;
        private String expirationDate;

        public CreditCard(String cardNumber, String cvv, String expirationDate) {
            this.cardNumber = cardNumber;
            this.cvv = cvv;
            this.expirationDate = expirationDate;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getCvv() {
            return cvv;
        }

        public void setCvv(String cvv) {
            this.cvv = cvv;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }
    }

    public class GiftCard {
        private String cardNumber;
        private int points;

        public GiftCard(String cardNumber, int points) {
            this.cardNumber = cardNumber;
            this.points = points;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }
    }
}

