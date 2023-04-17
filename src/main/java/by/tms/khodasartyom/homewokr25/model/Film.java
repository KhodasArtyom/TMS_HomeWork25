package by.tms.khodasartyom.homewokr25.model;

public class Film extends Show {
    public Film(String name, int yearOfIssue, String countryOfIssue, double rating, int numberOfEstimates) {
        super(name, yearOfIssue, countryOfIssue, rating, numberOfEstimates);
    }

    @Override
    public String toString() {
        String output = String.format("[Film] : %-35s %-9s %s            %.1f %7ss ",
                name,
                yearOfIssue,
                countryOfIssue,
                rating,
                numberOfEstimates);
        return output;
    }
}
