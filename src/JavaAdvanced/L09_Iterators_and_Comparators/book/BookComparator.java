package JavaAdvanced.L09_Iterators_and_Comparators.book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {

        int result = book1.getTitle().compareTo(book2.getTitle());
        if (result == 0) {
            result = Integer.compare(book1.getYear(), book2.getYear());
        }

        return result;
    }
}
