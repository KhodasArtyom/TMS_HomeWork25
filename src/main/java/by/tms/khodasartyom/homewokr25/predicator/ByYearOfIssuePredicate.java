package by.tms.khodasartyom.homewokr25.predicator;

import by.tms.khodasartyom.homewokr25.model.Show;

import java.util.function.Predicate;

public class ByYearOfIssuePredicate implements Predicate<Show> {

    private final int yearOfIssue;

    public ByYearOfIssuePredicate(Integer yearOfIssue) {
        if (yearOfIssue < 0) {
            throw new IllegalArgumentException("Year can't be < 0");
        }
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public boolean test(Show show) {
        return show.getYearOfIssue() == yearOfIssue;
    }
}
