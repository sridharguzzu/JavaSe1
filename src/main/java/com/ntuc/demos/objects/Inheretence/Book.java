package com.ntuc.demos.objects.Inheretence;

/**
 *
 * @author Sridhar Guzzu
 */
public class Book extends Literature {

    private String publisher;
    private String genre;

    public Book(String title, String author, String publisher, String genre) {
        super(title, author);
        this.publisher = publisher;
        this.genre = genre;
    }

    @Override
    public void Print() {
        System.out.println("Book: :" + title);
        System.out.println("\t Published by: " + publisher);
        System.out.println("\t and is a: " + genre);
    }
}
