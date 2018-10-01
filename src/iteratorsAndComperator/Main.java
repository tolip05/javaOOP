package iteratorsAndComperator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Book bookOne = new Book("Animal Farm", 2003,"George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930,"Dorothy Sayers","Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort( new BookComparator());
        for (Book book : books) {
            System.out.println(book.getTitle());
        }

//       Library lib = new Library(bookOne,bookTwo,bookThree);
//        for (Book book : lib) {
//            System.out.println(book.getTitle());
//        }
    }
}
