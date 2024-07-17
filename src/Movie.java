public class Movie extends Product {

    private String director;

    public Movie(String director) {
        this(1.1,null,null);
    }

    public Movie(double price, String name, String director) {
        super(price, name);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public double getDiscount()
    {
        return 10;
    }
}

