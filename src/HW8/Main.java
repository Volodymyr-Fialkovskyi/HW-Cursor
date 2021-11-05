package HW8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.takeBook(LocalDate.parse("2020-03-12"), "To Kill a Mockingbird");
        library.takeBook(LocalDate.parse("2020-05-01"), "1984");
        library.takeBook(LocalDate.parse("2020-07-28"), "The Lord of the Rings");
        library.takeBook(LocalDate.parse("2020-09-04"), "The Catcher in the Rye");
        library.takeBook(LocalDate.parse("2020-10-15"), "The Lion, the Witch and the Wardrobe");
        library.takeBook(LocalDate.parse("2020-12-25"), "Catch-22");
        library.takeBook(LocalDate.parse("2021-03-22"), "Lord of the Flies");
        library.takeBook(LocalDate.parse("2021-06-14"), "Animal Farm");

        System.out.println(library);

        System.out.println("Book1: " + library.searchBookByDate("14-06-21"));
        System.out.println("Book2: " + library.searchBookByDate("28-07-20"));
        System.out.println("List: " + library.bookList());
        System.out.println("Date range: " + library.dateRange());

    }
}


class Library {
    private final Map<LocalDate, String> libraryReport;
    private final DateTimeFormatter format;

    Library() {
        this.libraryReport = new HashMap<>();
        this.format = DateTimeFormatter.ofPattern("dd-MM-yy");
    }

    Library(Map<LocalDate, String> libraryReport, String format) {
        this.libraryReport = libraryReport;
        this.format = DateTimeFormatter.ofPattern(format);
    }

    public void takeBook(LocalDate date, String bookName) {
        this.libraryReport.put(date, bookName);
    }

    public String searchBookByDate(String date) {
        if (this.libraryReport.get(LocalDate.parse(date, format)) == null) {
            return "No books";
        } else return this.libraryReport.get(LocalDate.parse(date, format));
    }

    public Collection<String> bookList() {
        return libraryReport.values();
    }

    public LocalDate minDate() {
        return libraryReport.keySet().stream().min(LocalDate::compareTo).get();
    }

    public LocalDate maxDate() {
        return libraryReport.keySet().stream().max(LocalDate::compareTo).get();
    }

    public String dateRange() {
        return minDate() + " - " + maxDate();
    }

    @Override
    public String toString() {
        return "Library = " +
                "Report - " + libraryReport +
                '.';
    }
}