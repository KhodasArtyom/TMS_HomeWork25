package by.tms.khodasartyom.homewokr25.repository;

import by.tms.khodasartyom.homewokr25.model.Series;
import by.tms.khodasartyom.homewokr25.model.Show;

import java.time.Year;

public class SeriesDeserialization implements ShowDeserialization{
    @Override
    public Show deserialize(String line) {
        String[] parts = line.split(",");
        return new Series(
                parts[0],
                Year.parse(parts[1]),
                Year.parse(parts[2]),
                parts[3],
                Integer.parseInt(parts[4]),
                Integer.parseInt(parts[5]),
                Double.parseDouble(parts[6]),
                Integer.parseInt(parts[7])
        );
    }
}
