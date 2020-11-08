package com.company;
import java.util.Scanner;

public class BooksService {

    int booksCount = 0;
    public Book[] Library;

    public BooksService()
    {

    }

    public void InitLibrary()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter book count: ");
        booksCount = scan.nextInt();
        Library = new Book[booksCount];

        for(int i =0 ; i< booksCount; i++)
        {
            Library[i] = new Book();
            Library[i].InitBook(scan);
        }
    }

    public void PrintLibrary()
    {
        System.out.println("_______________________________________________");
        System.out.println("All books: ");
        for(int i =0 ; i< booksCount; i++)
        {
            System.out.print(Library[i].toString());
        }
    }

    public void PrintLibraryByYear(int year)
    {
        System.out.println("_______________________________________________");
        System.out.println("Books filtered by year (" + year + ")" );
        for(int i =0 ; i< booksCount; i++)
        {
            if(Library[i].getYear()>year)
            {
                System.out.print(Library[i].toString());
            }
        }
    }

    public void PrintLibraryByAuthor(String author)
    {
        System.out.println("_______________________________________________");
        System.out.println("Books filtered by author (" + author + ")" );
        for(int i =0 ; i< booksCount; i++)
        {
            if(Library[i].getAuthor().equals(author) )
            {
                System.out.print(Library[i].toString());
            }
        }
    }

    public void PrintLibraryByPublisher(String publisher)
    {
        System.out.println("_______________________________________________");
        System.out.println("Books filtered by publisher (" + publisher + ")" );
        for(int i=0;i<booksCount;i++)
        {
            if(Library[i].getPublisher().equals(publisher))
            {
                System.out.print(Library[i].toString());
            }
        }
    }
}
