package L09_Iterators_and_Comparators.book;

import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(String... authors) {
        this.authors = new ArrayList<>();
        for (String author : authors) {
            this.authors.add(author);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
               "title='" + title + '\'' +
               ", year=" + year +
               ", authors=" + authors +
               '}';
    }

    @Override
    public int compareTo(Book book) {
        // The book has to be compared by title.
        // When the title is equal, compare them by year.
        int result = this.getTitle().compareTo(book.getTitle());
        if (result == 0) {
            result = Integer.compare(this.getYear(), book.getYear());
        }
        return result;
    }
}
