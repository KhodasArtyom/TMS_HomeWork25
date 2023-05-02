import by.tms.khodasartyom.homewokr25.comparator.ByNameComparator;
import by.tms.khodasartyom.homewokr25.comparator.ByYearIssueComparator;
import by.tms.khodasartyom.homewokr25.model.Show;
import by.tms.khodasartyom.homewokr25.predicator.ByCountryOfIssuePredicate;
import by.tms.khodasartyom.homewokr25.predicator.ByYearOfIssuePredicate;
import by.tms.khodasartyom.homewokr25.repository.AllShowsRepository;
import by.tms.khodasartyom.homewokr25.repository.ShowRepository;
import by.tms.khodasartyom.homewokr25.service.ShowService;
import by.tms.khodasartyom.homewokr25.service.ShowServiceImpl;

import java.util.*;
import java.util.function.Predicate;

public class Main {



    public static void main(String[] args) {
        AllShowsRepository showRepository = new ShowRepository();
        ShowServiceImpl service = new ShowServiceImpl(showRepository);

        List<Predicate<Show>> filteringList = getFiltering();
        List<Comparator<Show>> sortingList = getSorting();
        List<Show> shows = service.request(filteringList,sortingList);
        if (shows.isEmpty()) {
            System.out.println("It is empty");
        } else {
            for (Show show : shows) {
                System.out.println(show.toString());
            }
        }


    }
    private static List<Predicate<Show>> getFiltering() {
        List<Predicate<Show>> filters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("add filter:\n" +
                "byCountry \"country code\"\n" +
                "byYearOFIssue \"year of Issue\"\n" +
                "end");
        while (true) {
            String request = scanner.nextLine();
            String[] parts = request.split("\\s+");

            if (parts[0].equals("end")) return filters;
            Predicate<Show> filter = switch (parts[0]) {
                case "byCountry" -> new ByCountryOfIssuePredicate(parts[1]);
                 case "byYearOfIssue" -> new ByYearOfIssuePredicate(Integer.parseInt(parts[1]));
                default -> throw new IllegalStateException("Unexpected value: " + parts[0]);
            };
            filters.add(filter);
        }
    }

    private static List<Comparator<Show>> getSorting() {
        List<Comparator<Show>> sortingList = new ArrayList<>();

        System.out.println("Sorting by:\n" +
                "byName\n" +
                "byYearIssue\n");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String request = scanner.nextLine();
            String[]parts = request.split("\\s+");
            if (parts[0].equals("end")) {
                return sortingList;
            }
            Comparator<Show> comparator = switch (parts[0]) {
                case "byName" -> ByNameComparator.BY_NAME_VAR;
                case "byYearIssue" -> ByYearIssueComparator.BY_YEAR_VAR;
                default ->throw new IllegalArgumentException("Error");
            };
            sortingList.add(comparator);
        }
    }


}