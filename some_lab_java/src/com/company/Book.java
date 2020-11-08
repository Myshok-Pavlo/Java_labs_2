package com.company;
import java.util.Scanner;

public class Book {
    public int id, year, numOfPages, price;
    public String name, author, publisher;

    public void setID(int ID) { id = ID; }
    public void setYear(int Year) { year = Year; }
    public void setNumOfPages(int NumOfPages) { numOfPages = NumOfPages; }
    public void setPrice(int Price) { price = Price; }
    public void setName(String Name) { name = Name; }
    public void setAuthor(String Author) { author = Author; }
    public void setPublisher(String Publisher) { publisher = Publisher; }

    public int getID() { return id; }
    public int getYear() { return year; }
    public int getNumOfPages() { return numOfPages; }
    public int getPrice() { return price; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }

    public String toString() {
        return "ID: " + this.id + "\tName: " + this.name + "\tAuthor: " + this.author +
                "\tPublisher: " + this.publisher + "\tYear: " + this.year + "\tNumber of pages: "
                + this.numOfPages + "\tPrice: " + this.price + "\n";
    }

    public Book()
    {


    }
    public Book(int _id, int _year, int _numOfPages, int _price, String _name, String _author, String _publisher)
    {
        InitBook( _id,  _year,  _numOfPages,  _price,  _name,  _author,  _publisher);

    }

    public void InitBook(int _id, int _year, int _numOfPages, int _price, String _name, String _author, String _publisher)
    {
        id = _id;
        year= _year;
        numOfPages= _numOfPages;
        price= _price;
        name= _name;
        author= _author;
        publisher= _publisher;

    }

    public void InitBook(Scanner scan)
    {

        System.out.print("enter book id: ");
        this.setID(scan.nextInt());

        System.out.print("enter book Name: ");
        this.setName(scan.next());

        System.out.print("enter book year: ");
        this.setYear(scan.nextInt());

        System.out.print("enter book num of pages: ");
        this.setNumOfPages(scan.nextInt());

        System.out.print("enter book Price: ");
        this.setPrice(scan.nextInt());

        System.out.print("enter book author: ");
        this.setAuthor(scan.next());

        System.out.print("enter book publisher: ");
        this.setPublisher(scan.next());



    }
}
