package by.tms.khodasartyom.homewokr25.repository;

import by.tms.khodasartyom.homewokr25.model.Film;
import by.tms.khodasartyom.homewokr25.model.Show;

import java.time.Year;

public class FilmDeserializer implements ShowDeserialization {
    @Override
    public Show deserialize(String line) {
        String[] parts = line.split(",");
        return new Film(parts[0],
                Year.parse(parts[1]),
                parts[2],
                Double.parseDouble(parts[3]),
                Integer.parseInt(parts[4]));

    }
}
