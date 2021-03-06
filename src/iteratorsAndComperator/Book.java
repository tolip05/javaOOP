package iteratorsAndComperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private Integer year;
    private List<String> authors;


    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getYear() {
        return this.year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }

    @Override
    public int compareTo(Book book) {
        if (this.title.compareTo(book.title) == 0){
          return this.year.compareTo(book.year);
        }
        return this.title.compareTo(book.title);
    }
}
