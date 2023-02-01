package lesson_1;

public class Book {
    private String name;
    private int year;
    public Book(String name){
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
}
