package entity;

import java.util.Date;

public class Book {
    private long id;

    public Book(String title, String author, String ISBN, double price, String publication, String date_of_release) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.publication = publication;
        this.date_of_release = date_of_release;
    }

    private String title;
    private String author;
    private String ISBN;
    private double price;
    private String publication;
    private String date_of_release;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                ", publication='" + publication + '\'' +
                ", date_of_release=" + date_of_release +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getDate_of_release() {
        return date_of_release;
    }

    public void setDate_of_release(String date_of_release) {
        this.date_of_release = date_of_release;
    }
}
