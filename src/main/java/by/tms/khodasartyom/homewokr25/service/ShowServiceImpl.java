package by.tms.khodasartyom.homewokr25.service;

import by.tms.khodasartyom.homewokr25.model.Show;
import by.tms.khodasartyom.homewokr25.repository.AllShowsRepository;
import by.tms.khodasartyom.homewokr25.repository.ShowRepository;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ShowServiceImpl implements ShowService {
private final AllShowsRepository repo;

    public ShowServiceImpl(AllShowsRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Show> request(List<Predicate<Show>> filters,List<Comparator<Show>> sorting) {
        List<Show> allShows = repo.getAllShows();
        useSorting(allShows,sorting);
        useFilters(allShows,filters);
        return allShows;
    }


    private  void useSorting(List<Show> list, List<Comparator<Show>> sorting) {
        if (!sorting.isEmpty()) {
            Iterator<Comparator<Show>> iterator = sorting.iterator();
            Comparator<Show> resultSorting = iterator.next();
            while (iterator.hasNext()) {
                Comparator<Show> next = iterator.next();
                resultSorting = resultSorting.thenComparing(next);
            }
            list.sort(resultSorting);
        }
    }

    public void useFilters(List<Show> shows, List<Predicate<Show>> filters) {
        if (!filters.isEmpty()) {
            Iterator<Predicate<Show>> iterator = filters.iterator();
            Predicate<Show> resultFiltering = iterator.next();
            while (iterator.hasNext()) {
                Predicate<Show> next = iterator.next();
                resultFiltering = resultFiltering.and(next);
            }
            shows.removeIf(resultFiltering.negate());
        }
    }
}
