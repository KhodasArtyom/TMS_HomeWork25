package by.tms.khodasartyom.homewokr25.model;

public abstract class Show {
    protected String name;
    protected int yearOfIssue;

    protected String countryOfIssue;

    protected double rating;

    protected int numberOfEstimates;

    public Show(String name, int yearOfIssue, String countryOfIssue, double rating, int numberOfEstimates) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.countryOfIssue = countryOfIssue;
        this.rating = rating;
        this.numberOfEstimates = numberOfEstimates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfIssue(String movie) {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    public void setCountryOfIssue(String countryOfIssue) {
        this.countryOfIssue = countryOfIssue;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumberOfEstimates() {
        return numberOfEstimates;
    }

    public void setNumberOfEstimates(int numberOfEstimates) {
        this.numberOfEstimates = numberOfEstimates;
    }

    @Override
    public String toString() {
        String output = String.format("[Show] : ")
        return  output;
    }


}
