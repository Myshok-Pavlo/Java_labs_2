package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        BooksService MyBooks =  new BooksService();
        BookFactory bf = new BookFactory(MyBooks);

        MyBooks.PrintLibrary();

        MyBooks.PrintLibraryByYear(2009);
        MyBooks.PrintLibraryByAuthor("Matvej");
        MyBooks.PrintLibraryByPublisher("Vatican");

        /*
        System.out.print("enter publisher of book: ");
        String publisher = scan.next();
        MyBooks.PrintLibraryByPublisher(publisher);
        */




    }
}
