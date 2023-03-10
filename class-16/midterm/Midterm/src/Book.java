public class Book {
    private BookName bookName;
    private String ISBN;
    private int yearPublished;

    private double price;

    public Book() {
    }
    public Book(BookName bookName, String ISBN, int yearPublished, double price) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public BookName getBookName() {
        return bookName;
    }

    public void setBookName(BookName bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Book Name: " + this.bookName + ", ISBN: " + this.ISBN + ", Year Published: " + this.yearPublished;
    }
}
