package by.tms.khodasartyom.homewokr25.model;

public class Series extends Show{

    private int yearIssueFinalEpisode;
    private int numberOfEpisodes;

    private int numberOfSeries;

    public Series(String name, int yearOfIssue, String countryOfIssue, double rating, int numberOfEstimates) {
        super(name, yearOfIssue, countryOfIssue, rating, numberOfEstimates);
    }

    public int getYearIssueFinalEpisode() {
        return yearIssueFinalEpisode;
    }

    public void setYearIssueFinalEpisode(int yearIssueFinalEpisode) {
        this.yearIssueFinalEpisode = yearIssueFinalEpisode;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getNumberOfSeries() {
        return numberOfSeries;
    }

    public void setNumberOfSeries(int numberOfSeries) {
        this.numberOfSeries = numberOfSeries;
    }


}
