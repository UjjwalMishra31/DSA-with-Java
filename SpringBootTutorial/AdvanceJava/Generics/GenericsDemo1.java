package SpringBootTutorial.AdvanceJava.Generics;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}

class Laptop {
    private String brand;
    private String model;

    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", model=" + model + "]";
    }
}

class ItemHolder<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class GenericsDemo1 {
    public static void main(String[] args) {
        Book book1 = new Book("Life", "Ujjwal Mishra");
        Book book2 = new Book("Legend", "Yasir Khan");

        Laptop laptop1 = new Laptop("Dell", "XPS 15");
        Laptop laptop2 = new Laptop("Asus", "VivoBook 15");

        ItemHolder<Book> bookHolder = new ItemHolder<>();
        ItemHolder<Laptop> laptopHolder = new ItemHolder<>();

        // Adding books and laptops
        bookHolder.addItem(book1);
        bookHolder.addItem(book2);

        laptopHolder.addItem(laptop1);
        laptopHolder.addItem(laptop2);

        // Retrieving items
        List<Book> retrievedBooks = bookHolder.getItems();
        List<Laptop> retrievedLaptops = laptopHolder.getItems();

        System.out.println("Book Items: " + retrievedBooks);
        System.out.println("Laptop Items: " + retrievedLaptops);

        // Accessing specific book and laptop details
        for (Book book : retrievedBooks) {
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
        }

        for (Laptop laptop : retrievedLaptops) {
            System.out.println("Laptop Brand: " + laptop.getBrand());
            System.out.println("Laptop Model: " + laptop.getModel());
        }
    }
}
