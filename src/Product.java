public abstract class Product {

    private String name;
    private double price;

    public Product()
    {
        this(0.0,null);
    }

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount()
    {
        return 0;
    }
}
