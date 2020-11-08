package com.company;

public class BookFactory {

    public  BookFactory(BooksService books)
    {

        books.booksCount = 5;
        books.Library = new Book[books.booksCount];
        books.Library[0] = new Book(1, 2009,209,4000, "Bible", "Matvej", "Vatican");
        books.Library[1] = new Book(1, 2008,209,4000, "Bible", "Luka", "Vatican");
        books.Library[2] = new Book(1, 2009,209,4000, "Bible", "Mark", "Kiev Lavra");
        books.Library[3] = new Book(1, 2007,209,4000, "Bible", "Ivan", "Vatican");
        books.Library[4] = new Book(1, 2009,209,4000, "Bible", "Matvej", "Kiev Lavra");
    }

}
