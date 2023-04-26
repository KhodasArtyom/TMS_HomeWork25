package by.tms.khodasartyom.homewokr25.repository;

import by.tms.khodasartyom.homewokr25.model.Film;
import by.tms.khodasartyom.homewokr25.model.Show;

import java.util.List;

public class FilmDeserializer implements DeserializeShowInterface{
    @Override
    public Show deserialize(List<Show> shows, String line) {
        String[] data = line.split(",");
        String name = data[0];
        int yearIssue = Integer.parseInt(data[1]);
        String country = data[2];
        double rating = Double.parseDouble(data[3]);
        int numberOfEstimates = Integer.parseInt(data[4]);
        return new Film(name,yearIssue,country,rating,numberOfEstimates);
    }
}
