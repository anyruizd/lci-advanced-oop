import java.util.List;
public class Order {
    private Client client;
    private List<Book> bookList;

    public Order() {
    }

    public Order(Client client, List<Book> bookList) {
        this.client = client;
        this.bookList = bookList;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void removeBook(Book book) {
        this.bookList.remove(book);
    }

    public void removeBook(int index) {
        this.bookList.remove(index);
    }

    public void removeAllBooks() {
        this.bookList.clear();
    }

    public void printOrder() {
        System.out.println("Order for " + this.client.getUsername());
        for (Book book : this.bookList) {
            System.out.println(book.toString());
        }
    }
}
