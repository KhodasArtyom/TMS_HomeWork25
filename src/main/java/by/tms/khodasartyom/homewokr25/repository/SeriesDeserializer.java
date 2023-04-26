package by.tms.khodasartyom.homewokr25.repository;

import by.tms.khodasartyom.homewokr25.model.Series;
import by.tms.khodasartyom.homewokr25.model.Show;

import java.util.List;

public class SeriesDeserializer implements DeserializeShowInterface {
    @Override
    public Show deserialize(List<Show> showList, String line) {
        String[] data = line.split(",");
        String title = data[0];
        int productionYear = Integer.parseInt(data[1]);
        int lastEpisodeYear = Integer.parseInt(data[2]);
        String country = data[3];
        int numSeasons = Integer.parseInt(data[4]);
        int numberOfEpisodes = Integer.parseInt(data[5]);
        double rating = Double.parseDouble(data[6]);
        int numberOfEstimates = Integer.parseInt(data[7]);
        return new Series(
                title,
                productionYear,
                lastEpisodeYear,
                country,
                numSeasons,
                numberOfEpisodes,
                rating,
                numberOfEstimates);
    }
}
