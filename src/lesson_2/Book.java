package lesson_2;

import java.util.Objects;

public class Book {
    private String name;
    private int year;
    private  Author author;

    public Book(Author author,String name){
        this.name = name;
        this.author = author;
    }



    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public String getName(){
        return  name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }

    @Override
    public String toString(){
        return name + " " + year;
    }
}
