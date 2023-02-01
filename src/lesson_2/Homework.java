package lesson_2;



public class Homework {
    public static void main(String[] args) {
        lesson_2.Book book = new lesson_2.Book(" Горе от ума ");
        book.setYear(1825);
        lesson_2.Author author = new lesson_2.Author(" Александр Сергеевич ", " Грибоедов ");
        System.out.println(author+""+book);

        lesson_2.Book bookTwo = new lesson_2.Book(" Герой нашего времени ");
        bookTwo.setYear(1838);
        lesson_2.Author authorTwo = new lesson_2.Author(" Михаил Юрьевич", " Лермонтов ");
        System.out.println(authorTwo+""+bookTwo);

        lesson_2.Book bookThree = new lesson_2.Book(" Горе от ума ");
        book.setYear(1825);
        lesson_2.Author authorThree = new lesson_2.Author(" Александр Сергеевич "," Грибоедов ");
        System.out.println(book.equals(bookThree)+" "+author.equals(authorThree));

        Book book4 = new Book(" Евгений Онегин");
        book4.setYear( 1831);
        Author author4 = new Author(" Александр Cергеевич ", " Пушкин ");
        System.out.println(book4.equals(bookThree) + " " + author4.equals(authorThree)) ;
        }
    }

