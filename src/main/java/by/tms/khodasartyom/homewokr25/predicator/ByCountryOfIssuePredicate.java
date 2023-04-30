package by.tms.khodasartyom.homewokr25.predicator;

import by.tms.khodasartyom.homewokr25.model.Show;

import java.util.function.Predicate;

public class ByCountryOfIssuePredicate implements Predicate<Show> {

    private final String countrySymols;

    public ByCountryOfIssuePredicate(String countrySymols) {
        this.countrySymols = countrySymols;
    }

    @Override
    public boolean test(Show show) {
        return show.getCountryOfIssue().equals(countrySymols);
    }
}
