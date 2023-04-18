package by.tms.khodasartyom.homewokr25.model;

import java.time.Year;

public class Series extends Show {

    private final int yearLastEpisode;
    private final int numberOfSeasons;

    private final int numberOfEpisodes;


    public int getYearLastEpisdoe() {
        return yearLastEpisode;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public int getNumberOfSeries() {
        return numberOfEpisodes;
    }

    @Override
    public String toString() {
        String output = String.format("[Serial] %-40s  %s–%s  %s  %2ss  %3se  %.1f  %7s",
                name,
                yearOfIssue,
                yearLastEpisode,
                countryOfIssue,
                numberOfSeasons,
                numberOfEpisodes,
                rating,
                numberOfEstimates);
        return output;
    }

    public Series(String name,
                  int yearOfIssue,
                  int yearIssueFinalEpisode,
                  String countryOfIssue,
                  int numberOfEpisodes,
                  int numberOfSeries,
                  Double rating,
                  int numberOfEstimates) {
        super(name, yearOfIssue, countryOfIssue, rating, numberOfEstimates);
        this.yearLastEpisode = yearIssueFinalEpisode;
        this.numberOfSeasons = numberOfEpisodes;
        this.numberOfEpisodes = numberOfSeries;
        if (numberOfEpisodes < 0 || numberOfSeries < 0) {
            throw new IllegalArgumentException("There is can't be negative ");
        }


    }
}
