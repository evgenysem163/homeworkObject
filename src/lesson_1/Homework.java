package lesson_1;

import lesson_1.Author;
import lesson_1.Book;

public class Homework {
    public static void main(String[] args) {
        lesson_1.Author author1 = new lesson_1.Author(" Александр Сергеевич", " Грибоедов ");
        lesson_1.Book book = new lesson_1.Book(author1,"Горе от ума");
        book.setYear(1825);
        System.out.println(author1.getName()+author1.getSurname()+" "+book.getName() +" "+ book.getYear());

        lesson_1.Author authorTwo = new lesson_1.Author(" Михаил Юрьевич", " Лермонтов ");
        lesson_1.Book bookTwo = new lesson_1.Book(authorTwo," Герой нашего времени ");
        bookTwo.setYear(1838);
        System.out.println(authorTwo.getSurname() + authorTwo.getName() + bookTwo.getName() + bookTwo.getYear());
    }
}