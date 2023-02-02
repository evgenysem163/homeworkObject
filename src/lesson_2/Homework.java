package lesson_2;



public class Homework {
    public static void main(String[] args) {
        lesson_2.Author author = new lesson_2.Author(" Александр Сергеевич ", " Грибоедов ");
        lesson_2.Book book = new lesson_2.Book(author," Горе от ума ");
        book.setYear(1825);
        System.out.println(author+""+book);

        lesson_2.Author authorTwo = new lesson_2.Author(" Михаил Юрьевич", " Лермонтов ");
        lesson_2.Book bookTwo = new lesson_2.Book(authorTwo," Герой нашего времени ");
        bookTwo.setYear(1838);
        System.out.println(authorTwo+""+bookTwo);

        lesson_2.Author authorThree = new lesson_2.Author(" Александр Сергеевич "," Грибоедов ");
        lesson_2.Book bookThree = new lesson_2.Book(authorThree, " Горе от ума ");
        book.setYear(1825);
        System.out.println(book.equals(bookThree)+" "+author.equals(authorThree));

        Author author4 = new Author(" Александр Cергеевич ", " Пушкин ");
        Book book4 = new Book(author4, " Евгений Онегин");
        book4.setYear( 1831);
        System.out.println(book4.equals(bookThree) + " " + author4.equals(authorThree)) ;
        }
    }

