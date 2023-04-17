package by.tms.khodasartyom.homewokr25.repository;

import by.tms.khodasartyom.homewokr25.config.DirectoryProperties;
import by.tms.khodasartyom.homewokr25.model.Show;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShowRepository implements MoviesAndSeriesRepository {


    private final Path MOVIES_CSV = Path.of("films.csv");
    private final Path SERIES_CSV = Path.of("series.csv");
    private DirectoryProperties properties;


    public ShowRepository(DirectoryProperties properties) {
        this.properties = properties;
    }


    @Override
    public List<Show> getAllShows() {
        List<Show> listOfShows = new ArrayList<>();
        readAllShows(listOfShows,MOVIES_CSV,new FilmDeserializer());
        readAllShows(listOfShows,SERIES_CSV,new SeriesDeserialization());
        return listOfShows;
    }

    private void readAllShows(List<Show> destination, Path path, ShowDeserialization deserializer) {
        Path seriesPath = properties.getDirectory().resolve(path);
        try (BufferedReader bf = Files.newBufferedReader(seriesPath)) {
            String lineCSV = bf.readLine();
            while (lineCSV != null) {
                Show show = deserializer.deserialize(lineCSV);
                destination.add(show);
                lineCSV = bf.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
