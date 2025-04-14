import java.util.List;

public class Main {
    public static void main(String[] args) {
        MobileGameReader reader = new MobileGameReader();
        String filePath = "data/MobileGameDataset.csv";
        List<mobileGame> games = reader.readMobileGames(filePath);

        for (mobileGame game : games) {
            System.out.println(game);
        }
    }
}