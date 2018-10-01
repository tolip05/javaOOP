package iteratorsAndComperator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{
    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getTitle().compareTo(b2.getTitle()) == 0){
            return b1.getYear().compareTo(b2.getYear());
        }
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
