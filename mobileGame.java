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