package driver;

import entity.Book;
import service.Book_Service;

import java.util.Date;
import java.util.Scanner;

public class Library_Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        Book_Service book_service = new Book_Service();
        int options;
        String title,author,publication,date,isbn;
        double price;
        while(true){
            System.out.println("----MENU-----");
            System.out.println("1. Add Book \n2. Delete Book \n3. Update Book \n4. Find Book By Name \n5. Get All Books \n6. Exit");
            options = sc.nextInt();
            switch (options){
                case 1 :
                    sc.nextLine();
                    System.out.println("Enter the book title:");
                    title = sc.nextLine();
                    System.out.println("Enter the book author:");
                    author = sc.nextLine();
                    System.out.println("Enter the book ISBN:");
                    isbn = sc.next();
                    System.out.println("Enter the book price");
                    price  = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter the book publication:");
                    publication = sc.nextLine();
                    System.out.println("Enter the date of arrival");
                    date = sc.next();
                    Book book = new Book(title,author,isbn,price,publication,date);
                    book_service.addBook(book);
                    break;
                case 2 :
                    sc.nextLine();
                    System.out.println("Enter the book title:");
                    title = sc.nextLine();
                    System.out.println( book_service.deleteBook(title));
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter the book title:");
                    title = sc.nextLine();
                    System.out.println("Enter the book author:");
                    author = sc.nextLine();
                    System.out.println("Enter the book ISBN:");
                    isbn = sc.next();
                    System.out.println("Enter the book price");
                    price  = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter the book publication:");
                    publication = sc.nextLine();
                    System.out.println("Enter the date of arrival");
                    date = sc.next();
                    book = new Book(title,author,isbn,price,publication,date);
                    book_service.updateBook(title,book);
                    break;
                case 4 :
                    sc.nextLine();
                    System.out.println("Enter book title");
                    title = sc.nextLine();
                    System.out.println(book_service.findBook(title));
                    break;
                case 5 :
                    System.out.println("All the books are");
                    book_service.getAllBooks();
                    break;
                case 6 :
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Please enter a valid choice: ");
            }
        }
    }
}
