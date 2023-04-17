package by.tms.khodasartyom.homewokr25.repository;

import by.tms.khodasartyom.homewokr25.model.Show;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShowRepository implements MoviesAndSeriesRepository {


     final Path MOVIES_CSV = Path.of("films.csv");
     final Path SERIES_CSV = Path.of("series.csv");

     private List<Movie> getListMovie(Path path) {
          List<Movie> listOfMovie = new ArrayList<>();
          try (BufferedReader bf = new BufferedReader(new FileReader(path.toString()))) {
               String line;
               while ((line = bf.readLine()) != null) {
                    String[] movies = line.split(",");
                    Movie movie = new Movie("afk",1994,"US",8.6,500);
                    movie.setName(movies[0]);
                    movie.setYearOfIssue(Integer.parseInt(movies[1]));
                    movie.setCountryOfIssue(movies[2]);
                    movie.setRating(Double.parseDouble(movies[3]));
                    movie.setNumberOfEstimates(Integer.parseInt(movies[4]));
                    listOfMovie.addAll((Collection<? extends Movie>) movie);

               }
          } catch (FileNotFoundException e) {
               throw new RuntimeException(e);
          } catch (IOException e) {
               throw new RuntimeException(e);
          }
          return listOfMovie;
     }

    @Override
    public ArrayList<Show> getAllShows(  ) {
        List<Show> showList = new ArrayList<>();
        List<Movie> movieList = getListMovie(MOVIES_CSV);

        showList.addAll(movieList);

        return (ArrayList<Show>) showList;
    }
}
