import by.tms.khodasartyom.homewokr25.model.Show;
import by.tms.khodasartyom.homewokr25.repository.ShowRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShowRepository showRepository = new ShowRepository();
        List<Show> showList = new ArrayList<>();
        showList = showRepository.getAllShows();
        for(Show show : showList) {
            System.out.println(show.toString());
        }

    }
}