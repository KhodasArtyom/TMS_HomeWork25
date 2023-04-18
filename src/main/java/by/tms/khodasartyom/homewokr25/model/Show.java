package by.tms.khodasartyom.homewokr25.model;

import java.time.Year;

public abstract class Show {
    private static final int CODE_COUNTRY = 2;
    private static final int MAX_RATING = 10;
    private static final int MIN_RATING = 0;
    protected String name;
    protected int yearOfIssue;

    protected String countryOfIssue;

    protected double rating;

    protected int numberOfEstimates;


    public Show(String name, int yearOfIssue, String countryOfIssue, Double rating,
                int numberOfEstimates) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.countryOfIssue = countryOfIssue;
        this.rating = rating;
        this.numberOfEstimates = numberOfEstimates;

        if (name.isEmpty()) {
            throw new IllegalArgumentException("There is no name");
        } else if (countryOfIssue.length() > CODE_COUNTRY || countryOfIssue.length() < CODE_COUNTRY) {
            throw new IllegalArgumentException("THe code should be with two symbols");
        } else if (rating > MAX_RATING || rating < MIN_RATING) {
            throw new IllegalArgumentException("Error.You can't put this rating.Try 0-10");
        } else if (numberOfEstimates < 0) {
            throw new IllegalArgumentException("Error!");
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    public double getRating() {
        return rating;
    }


    public int getNumberOfEstimates() {
        return numberOfEstimates;
    }
}
