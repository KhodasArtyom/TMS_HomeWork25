package by.tms.khodasartyom.homewokr25.comparator;

import by.tms.khodasartyom.homewokr25.model.Show;

import java.util.Comparator;

public class ByYearIssueComparator implements Comparator<Show> {
    public static final Comparator<Show> BY_YEAR_VAR = new ByYearIssueComparator();

    private ByYearIssueComparator() {
    }

    @Override
    public int compare(Show show1, Show show2) {
        return Integer.compare(show1.getYearOfIssue(),show2.getYearOfIssue());
    }
}
