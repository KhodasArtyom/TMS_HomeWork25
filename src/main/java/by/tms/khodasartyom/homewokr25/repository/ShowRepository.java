package by.tms.khodasartyom.homewokr25.repository;

import by.tms.khodasartyom.homewokr25.model.Film;
import by.tms.khodasartyom.homewokr25.model.Series;
import by.tms.khodasartyom.homewokr25.model.Show;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ShowRepository implements AllShowsRepository {
    public static final String FILMS_CSV = "films.csv";
    public static final String SERIES_CSV = "series.csv";

    public List<Show> getAllShows() {
        List<Show> shows = new ArrayList<>();
        readAllShows(shows, Path.of(FILMS_CSV),new FilmDeserializer());
        readAllShows(shows,Path.of(SERIES_CSV),new SeriesDeserializer());

        return shows;
    }



    private void readAllShows(List<Show> shows, Path path, DeserializeShowInterface deserializer) {
        String line;
        try (BufferedReader reader = Files.newBufferedReader(path)){
            line = reader.readLine();
            while (line != null) {
                Show show = deserializer.deserialize(shows,line);
                shows.add(show);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



    }


