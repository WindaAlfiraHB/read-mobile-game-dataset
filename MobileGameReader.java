import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MobileGameReader {
    public List<mobileGame> readMobileGames(String filePath) {
        List<mobileGame> mobileGames = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header line
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // Pastikan ada cukup kolom
                if (values.length < 4) {
                    System.out.println("Data tidak lengkap: " + line);
                    continue; // Lewati baris ini
                }

                String name = values[0].trim();
                String developer = values[1].trim();
                String genre = values[2].trim();
                float rating = 0.0f;

                // Coba konversi rating
                try {
                    rating = Float.parseFloat(values[3].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Rating tidak valid untuk game: " + name + ". Menggunakan 0.0 sebagai default.");
                }

                mobileGame game = new mobileGame(name, developer, genre, rating);
                mobileGames.add(game);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mobileGames;
    }
}