package by.tms.khodasartyom.homewokr25.repository;

import by.tms.khodasartyom.homewokr25.model.Film;
import by.tms.khodasartyom.homewokr25.model.Series;
import by.tms.khodasartyom.homewokr25.model.Show;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowRepository implements AllShowsRepository {
    public static final String FILMS_CSV = "films.csv";
    public static final String SERIES_CSV = "series.csv";

    public List<Show> getAllShows() {
        List<Show> shows = new ArrayList<>();

        try (BufferedReader filmsReader = new BufferedReader(new FileReader(FILMS_CSV))) {
            String line;
            while ((line = filmsReader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int yearIssue = Integer.parseInt(data[1]);
                String country = data[2];
                double rating = Double.parseDouble(data[3]);
                int numberOfEstimates = Integer.parseInt(data[4]);
                shows.add(new Film(name, yearIssue, country, rating, numberOfEstimates));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader seriesReader = new BufferedReader(new FileReader(SERIES_CSV))) {
            String line2;
            while ((line2 = seriesReader.readLine()) != null) {
                String[] data = line2.split(",");
                String title = data[0];
                int productionYear = Integer.parseInt(data[1]);
                int lastEpisodeYear = Integer.parseInt(data[2]);
                String country = data[3];
                int numSeasons = Integer.parseInt(data[4]);
                int numberOfEpisodes = Integer.parseInt(data[5]);
                double rating = Double.parseDouble(data[6]);
                int numberOfEstimates = Integer.parseInt(data[7]);
                shows.add(new Series(title, productionYear, lastEpisodeYear, country,
                        numSeasons, numberOfEpisodes, rating, numberOfEstimates));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return shows;

    }

}
