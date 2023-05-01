package by.tms.khodasartyom.homewokr25.service;

import by.tms.khodasartyom.homewokr25.model.Show;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public interface ShowService {

List<Show> request(List<Comparator<Show>> sorting, List<Predicate<Show>> filters);

}
