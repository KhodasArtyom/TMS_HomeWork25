import by.tms.khodasartyom.homewokr25.comparator.ByNameComparator;
import by.tms.khodasartyom.homewokr25.comparator.ByYearIssueComparator;
import by.tms.khodasartyom.homewokr25.model.Show;
import by.tms.khodasartyom.homewokr25.predicator.ByCountryOfIssuePredicate;
import by.tms.khodasartyom.homewokr25.predicator.ByYearOfIssuePredicate;
import by.tms.khodasartyom.homewokr25.repository.ShowRepository;
import by.tms.khodasartyom.homewokr25.service.ShowService;
import by.tms.khodasartyom.homewokr25.service.ShowServiceImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    ShowRepository showRepository = new ShowRepository();

    public static void main(String[] args) {
        ShowRepository showRepository = new ShowRepository();
        ShowServiceImpl service = new ShowServiceImpl(showRepository);

        List<Show> showList = showRepository.getAllShows();

        List<Comparator<Show>> sortingList = getSorting();
        List<Predicate<Show>> filteringList = getFiltering();
        List<Show> shows = service.request(sortingList, filteringList);
        if (shows.isEmpty()) {
            System.out.println("It is empty");
        } else {
            for (Show show : showList) {
                System.out.println(show.toString());
            }
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
            if (request.equals("end")) {
                return sortingList;
            }
            Comparator<Show> comparator = switch (request) {
                case "byName" -> new ByNameComparator();
                case "byYearIssue" -> new ByYearIssueComparator();
                default -> throw new RuntimeException();
            };
            sortingList.add(comparator);
        }
    }

    private static List<Predicate<Show>> getFiltering() {
        List<Predicate<Show>> filters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Filtering by:\n" +
                "CountryOfIssue\n" +
                "ByYearOFIssue\n" +
                "end");
        while (true) {
            String request = scanner.nextLine();
            String[] parts = request.split("\\s+");

            if (parts[0].equals("end")) return filters;
            Predicate<Show> filter = switch (parts[0]) {
                case "byCountry" -> new ByCountryOfIssuePredicate(parts[1]);
                case "byYearOfIssue" -> new ByYearOfIssuePredicate(Integer.parseInt(parts[2]));
                default -> throw new IllegalStateException("Unexpected value: " + parts[0]);
            };
            filters.add(filter);
        }
    }
}