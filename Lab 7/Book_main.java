// Declare a class called book having author_name as private data member. Extend book 
// class to have two sub classes called book_publication & paper_publication. Each of 
// these classes have private member called title. Write a complete program to show 
// usage of dynamic method dispatch (dynamic polymorphism) to display book or paper 
// publications of given author.Use command line arguments for input data.

import java.util.Scanner;

class Book {
    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    public String getauthor() {
        return author_name;
    }

    void display() {
        System.out.println(author_name);
    }
}

class book_publication extends Book {
    private String title;

    book_publication(String title, String author_name) {
        super(author_name);
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println(title);
    }
}

class paper_publication extends Book {
    private String title;

    paper_publication(String title, String author_name) {
        super(author_name);
        this.title = title;
    }

    void display() {
        System.out.println(getauthor());
        System.out.println(title);
    }

}

public class Book_main {
    public static void main(String[] args) {
        // System.out.println("Enter author name:");
        String author_name = args[0];
        // System.out.println("Enter book or paper:");
        String creat_object = args[1];
        // System.out.println("Enter title:");
        String title = args[2];

        Book b = new Book(author_name);
        if (creat_object.equals("book")) {
            b = new book_publication(title, "vishal kansagra");
        }
        if (creat_object.equals("paper")) {
            b = new paper_publication(title, "arjun bala");
        } else {
            System.out.println("Enter valid book or paper:");
            return;
        }

        b.display();

    }
}
