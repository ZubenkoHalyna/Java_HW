package hw_1;

import java.util.Arrays;

public class Book {
    private int id;
    private int year;
    private String title;
    private String[] authors;

    public Book() {}

    public Book(int id, int year, String title, String[] authors) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", year=" + year +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
