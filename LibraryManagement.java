class Book {
    protected String title;
    protected String author;
    protected double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Derived class for Fiction books
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

// Derived class for Non-Fiction books
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

// Main class to test the implementation
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating Fiction book
        Fiction fictionBook = new Fiction("Harry Potter", "J.K. Rowling", 500);
        
        // Creating Non-Fiction book
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 700);
        
        // Displaying book details
        fictionBook.displayDetails();
        System.out.println();
        nonFictionBook.displayDetails();
    }
}
