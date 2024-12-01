package showingMovieSystem;

public class Movie {
    private String name;
    private int ID;
    private double price;
    private String actor;

    public Movie(String name, int ID, double price, String actor)
    {
        this.name = name;
        this.ID = ID;
        this.price = price;
        this.actor = actor;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public int setID(int ID) {
        this.ID = ID;
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
