package by.tms.khodasartyom.homewokr25.comparator;

import by.tms.khodasartyom.homewokr25.model.Show;

import java.util.Comparator;

public class ByYearIssueComparator implements Comparator<Show> {
    @Override
    public int compare(Show show1, Show show2) {
        return Integer.compare(show1.getYearOfIssue(),show2.getYearOfIssue());
    }
}
