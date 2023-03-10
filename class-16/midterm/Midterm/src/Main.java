import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ----------------- Login -----------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        Login login = new Login();
        Client client = new Client(username, password);
        // ----------------- Create new client -----------------
        if(!login.isValidMember(username, password)){
            System.out.println("Let's create a new account...");
            System.out.println("Please enter your email: ");
            String email = scanner.nextLine();
            System.out.println("Please enter your day of birth: ");
            int dayOfBirth = scanner.nextInt();
            System.out.println("Please enter your month of birth (1-12): ");
            int monthOfBirth = scanner.nextInt();
            System.out.println("Please enter your year of birth: ");
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            Date dateOfBirth = new Date(yearOfBirth,monthOfBirth,dayOfBirth);

            client = new Client(username, password, email, dateOfBirth);
            login.createAccount(client);
        }

        // ----------------- Create the Order -----------------
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(BookName.THE_LORD_OF_THE_RINGS, "1234567890", 1954, 100));
        bookList.add(new Book(BookName.THE_HOBBIT, "0987654321", 1937, 100));
        bookList.add(new Book(BookName.THE_LITTLE_PRINCE, "1234567890", 2023, 100));
        bookList.add(new Book(BookName.THE_LIFE_OF_PI, "1234567890", 2022, 100));

        System.out.println("Please select the book you want to buy: ");
        int i = 0;
        for (i = 0; i < bookList.size(); i++) {
            System.out.println((i + 1) + ". " + bookList.get(i).toString());
        }
        System.out.println((bookList.size()+1) + ". All books");
        int bookNumber = scanner.nextInt();
        if (bookNumber != (bookList.size()+1)) {
            Book book = bookList.get(bookNumber - 1);
            bookList.clear();
            bookList.add(book);
        }
        // ----------------- Delivery or Pickup -----------------
        System.out.println("Do you want to pick up the book(s) or you want a delivery?");
        System.out.println("1. Pick up");
        System.out.println("2. Delivery");
        int deliveryOption = scanner.nextInt();
        scanner.nextLine();

        if (deliveryOption == 2) {
            System.out.println("Let's confirm your address...");
            System.out.println("Please enter your Street: ");
            String street = scanner.nextLine();

            System.out.println("Please enter your City: ");
            String city = scanner.nextLine();

            System.out.println("Please enter your State: ");
            String state = scanner.nextLine();

            System.out.println("Please enter your Zip code: ");
            String zipCode = scanner.nextLine();

            Address address = new Address(street, city, state, zipCode);
            client.setAddress(address);
            OnlineOrder order = new OnlineOrder(client, bookList);

            // ----------------- Payment Methods -----------------
            System.out.println("Please select your payment method: ");
            System.out.println("1. Credit Card");
            System.out.println("2. Gift Card");
            int paymentMethod = scanner.nextInt();
            scanner.nextLine();
            PayOnline payOnline = new PayOnline();
            if (paymentMethod == 1) {
                System.out.println("Please enter your credit card number: ");
                String creditCardNumber = scanner.nextLine();
                System.out.println("Please enter your credit card expiration date: ");
                String creditCardExpirationDate = scanner.nextLine();
                System.out.println("Please enter your credit card CVV: ");
                String creditCardCVV = scanner.nextLine();

                PayOnline.CreditCard creditCard = payOnline.new CreditCard(creditCardNumber, creditCardExpirationDate, creditCardCVV);

            } else if (paymentMethod == 2) {
                System.out.println("Please enter your gift card number: ");
                String giftCardNumber = scanner.nextLine();
                System.out.println("Please enter your gift card points: ");
                int giftCardPoints = scanner.nextInt();
                scanner.nextLine();
                PayOnline.GiftCard giftCard = payOnline.new GiftCard(giftCardNumber, giftCardPoints);

            }

            // ----------------- Special Offer -----------------
            SpecialOffer specialOffer = new SpecialOffer(client, order);
            specialOffer.printSpecialOffer();

        } else if (deliveryOption == 1) {
            PickupOrder order = new PickupOrder(client, bookList);

            // ----------------- Special Offer -----------------
            SpecialOffer specialOffer = new SpecialOffer(client, order);
            specialOffer.printSpecialOffer();
        }

    }
}