package by.tms.khodasartyom.homewokr25.model;

public class Movie extends Show {
    public Movie(String name,int yearOfIssue,String countryOfIssue,double rating,int numberOfEstimates) {
        super();

    }



    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", countryOfIssue='" + countryOfIssue + '\'' +
                ", rating=" + rating +
                ", numberOfEstimates=" + numberOfEstimates +
                '}';
    }


}
