public class mobileGame {
    private String name;
    private String developer;
    private String genre;
    private float rating;

    public mobileGame(String name, String developer, String genre, float rating) {
        this.name = name;
        this.developer = developer;
        this.genre = genre;
        this.rating = rating;
    }

    public mobileGame(String name, String developer) {
        this.name = name;
        this.developer = developer;
        this.genre = "Unknown";
        this.rating = 0.0f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "mobileGame{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
