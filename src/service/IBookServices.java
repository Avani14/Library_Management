package service;

import entity.Book;

import java.util.HashMap;

public interface IBookServices {
    Book findBook(String name);
    Book addBook (Book book);
    String deleteBook (String name);
    Book updateBook (String name,Book new_book);
    void getAllBooks();
    HashMap<String,Book> getBooksByArrivals();

}
