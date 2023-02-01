package lesson_1;

import lesson_1.Author;
import lesson_1.Book;

public class Homework {
    public static void main(String[] args) {
        Book book = new Book(" Горе от ума ");
        book.setYear(1825);
        Author author = new Author(" Александр Сергеевич", " Грибоедов ");
        System.out.println(author.getSurname() + author.getName() + book.getName() + book.getYear());

        Book bookTwo = new Book(" Герой нашего времени ");
        bookTwo.setYear(1838);
        Author authorTwo = new Author(" Михаил Юрьевич", " Лермонтов ");
        System.out.println(authorTwo.getSurname() + authorTwo.getName() + bookTwo.getName() + bookTwo.getYear());
    }
}