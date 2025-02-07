package L09_Iterators_and_Comparators.Exercise.demo;

import java.util.Comparator;

public class MovieBudgetComparator implements Comparator<Movie> {


    @Override
    public int compare(Movie movie1, Movie movie2) {

        return movie1.getBudget().compareTo(movie2.getBudget());
    }
}
