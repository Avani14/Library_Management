package service;

import entity.Book;

import java.util.HashMap;
import java.util.Map;

public class Book_Service implements IBookServices{
    public static HashMap<String, Book> bookHashMap = new HashMap<>();

    @Override
    public Book findBook(String name) {
        for (Map.Entry<String,Book> iterator:bookHashMap.entrySet()) {
            if(iterator.getKey().equals(name)){
                return iterator.getValue();
            }
        }
        return null;
    }

    @Override
    public Book addBook(Book book) {
        if (bookHashMap.entrySet().contains(book)) {
            return null;
        }
        bookHashMap.put(book.getTitle(),book);
        System.out.println("Book added Successfully");
        return book;
    }

    @Override
    public String deleteBook(String name) {
        if (bookHashMap.containsKey(name)) {
            for (Map.Entry<String, Book> iterator : bookHashMap.entrySet()) {
                if (iterator.getKey().equals(name)) {
                    bookHashMap.remove(name);
                    return "Book was successfully deleted";
                }
            }
        }
        return "Failed to delete the book "+name+" .";
    }

    @Override
    public Book updateBook(String name,Book new_book) {
        if (bookHashMap.containsKey(name)) {
            for (Map.Entry<String, Book> iterator : bookHashMap.entrySet()) {
                if (iterator.getKey().equals(name)) {
                    bookHashMap.replace(name, iterator.getValue(),new_book);
                    return bookHashMap.get(iterator.getValue());
                }
            }
        }
        return null;
    }

    @Override
    public void getAllBooks() {
        bookHashMap.entrySet().stream().forEach(book -> System.out.println(book));
    }

    @Override
    public HashMap<String, Book> getBooksByArrivals() {
        return null;
    }
}
