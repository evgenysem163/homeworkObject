package lesson_1;

public class Book {
    private String name;
    private int year;

    private Author author;
    public Book(Author author,String name){
        this.author = author;
        this.name = name;

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
//    public void setAuthor(Author author){
//        this.author = author;
//
//    }
}
