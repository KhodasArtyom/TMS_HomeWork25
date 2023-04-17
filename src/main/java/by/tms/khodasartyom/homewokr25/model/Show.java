package by.tms.khodasartyom.homewokr25.model;

import java.sql.Date;
import java.time.Year;

public abstract class Show {
    protected String name;
    protected Year yearOfIssue;

    protected String countryOfIssue;

    protected double rating;

    protected int numberOfEstimates;

    private final int CODE_COUNTRY = 2;
    private final int MAX_RATING = 10;
    private final int MIN_RATING = 0;

    public Show(String name,Year yearOfIssue, String countryOfIssue, double rating,
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

    public Year getYearOfIssue() {
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
