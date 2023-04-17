package by.tms.khodasartyom.homewokr25;

 import by.tms.khodasartyom.homewokr25.model.Show;
import by.tms.khodasartyom.homewokr25.repository.ShowRepository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShowRepository showRepository = new ShowRepository();
        List<Show> showList = showRepository.getAllShows();
        for(Show itm : showList) {
            System.out.println(itm.toString());
        }
    }

}
