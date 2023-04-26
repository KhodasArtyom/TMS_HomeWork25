package by.tms.khodasartyom.homewokr25.comparator;

import by.tms.khodasartyom.homewokr25.model.Show;

import java.util.Comparator;

public class ByNameComparator implements Comparator<Show> {
    @Override
    public int compare(Show show1, Show show2) {
        return show1.getName().compareTo(show2.getName());
    }
}
