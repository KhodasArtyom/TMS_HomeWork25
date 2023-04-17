package by.tms.khodasartyom.homewokr25.model;

import java.time.Year;

public class Series extends Show {

    private final Year yearIssueFinalEpisode;
    private final int numberOfEpisodes;

    private final int numberOfSeries;


    public Year getYearIssueFinalEpisode() {
        return yearIssueFinalEpisode;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public int getNumberOfSeries() {
        return numberOfSeries;
    }

    @Override
    public String toString() {
        String output = String.format()
        return output;
    }

    public Series(String name,
                  Year yearOfIssue,
                  Year yearIssueFinalEpisode,
                  String countryOfIssue,
                  int numberOfEpisodes,
                  int numberOfSeries,
                  Double rating,
                  int numberOfEstimates) {
        super(name, yearOfIssue, countryOfIssue, rating, numberOfEstimates);
        this.yearIssueFinalEpisode = yearIssueFinalEpisode;
        this.numberOfEpisodes = numberOfEpisodes;
        this.numberOfSeries = numberOfSeries;
        if (numberOfEpisodes < 0 || numberOfSeries < 0) {
            throw new IllegalArgumentException("There is can't be negative ");
        }


    }
}
