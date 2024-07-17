public class Book extends Product {

    private String author;

    public Book() {
        this(0.0,null,null);
    }

    public Book(double price, String name, String author) {
        super(price, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public double getDiscount()
    {
        return 10;
    }
}
